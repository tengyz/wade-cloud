/* ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package com.wadex.common.core.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CacheMap implements java.io.Serializable {
	/**
	 * 最后一次初始化时间
	 */
	private long lastInitTime = System.currentTimeMillis();
	/**
	 * 缓存刷新时间 默认不刷新 
	 */
	private long intervalSeconds = 0L;

	private static class Entry implements Map.Entry {

		private final Object key;
		private Object value;

		// them.
		Entry next = null;
		Entry prev = null;

		public Entry(Object key, Object value) {
			this.key = key;
			this.value = value;
		}

		// per Map.Entry.getKey()
		public Object getKey() {
			return this.key;
		}

		// per Map.Entry.getValue()
		public Object getValue() {
			return this.value;
		}

		// per Map.Entry.setValue()
		public Object setValue(Object value) {
			Object oldValue = this.value;
			this.value = value;
			return oldValue;
		}

		public int hashCode() {
			return ((getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ? 0
					: getValue().hashCode()));
		}

		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			if (obj == this)
				return true;
			if (!(obj instanceof Map.Entry))
				return false;

			Map.Entry other = (Map.Entry) obj;

			// implemented per api docs for Map.Entry.equals(Object)
			return ((getKey() == null ? other.getKey() == null : getKey()
					.equals(other.getKey())) && (getValue() == null ? other
					.getValue() == null : getValue().equals(other.getValue())));
		}

		public String toString() {
			return "[" + getKey() + "=" + getValue() + "]";
		}
	}

	private static final Entry createSentinel() {
		Entry s = new Entry(null, null);
		s.prev = s;
		s.next = s;
		return s;
	}

	private Entry sentinel;

	private HashMap entries;

	private int maximumSize = 0;

	protected int itemCount = 0;

	public CacheMap(int maxSize) {
		sentinel = createSentinel();
		entries = new HashMap(50);
		maximumSize = maxSize;
	}

	public synchronized boolean containKey(Object key) {
		if (maximumSize == 0)
			return false;

		return entries.containsKey(key);
	}

	public synchronized Object get(Object key) {
		if (intervalSeconds > 0) {
			if (System.currentTimeMillis() - lastInitTime > intervalSeconds) {
				clear();
				return null;
			}
		}
		if (maximumSize == 0)
			return null;

		Entry e = (Entry) entries.get(key);
		if (e == null)
			return null;

		removeEntry(e);
		insertEntry(e);

		return e.getValue();
	}

	public synchronized Object put(Object key, Object value) {
		if (maximumSize == 0)
			return null;
		int mapSize = itemCount + getSize(value);
		Object retval = null;

		if ((maximumSize > 0) && (mapSize > maximumSize)) {
			// don't retire LRU if you are just
			// updating an existing key
			if (!entries.containsKey(key)) {
				// lets retire the least recently used item in the cache
				removeFirst();
			}
		}
		retval = putLast(key, value);
		return retval;
	}

	public synchronized void clear() {
		entries.clear();
		// and the list
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
		lastInitTime = System.currentTimeMillis();
	}

	public synchronized Object remove(Object key) {
		Entry e = (Entry) entries.remove(key);
		if (e == null)
			return null;
		removeEntry(e);
		this.itemCount -= this.getSize(e.getValue());
		return (e == null) ? null : e.getValue();
	}

	private Object putLast(Object key, Object value) {
		Object oldValue = null;

		// lookup the entry for the specified key
		Entry e = (Entry) entries.get(key);

		// check to see if it already exists
		if (e != null) {
			// remove from list so the entry gets "moved" to the end of list
			removeEntry(e);
			oldValue = e.setValue(value);
			this.itemCount -= this.getSize(oldValue);
		} else {
			// add new entry
			e = new Entry(key, value);
			entries.put(key, e);
		}
		// assert(entry in map, but not list)
		// add to list
		insertEntry(e);
		this.itemCount += getSize(e.getValue());

		return oldValue;
	}

	protected void removeFirst() {
		Object key = sentinel.next.getKey();
		Entry e = (Entry) entries.remove(key);
		if (e == null)
			return;
		removeEntry(e);
		this.itemCount -= this.getSize(e.getValue());
	}

	private void removeEntry(Entry entry) {
		entry.next.prev = entry.prev;
		entry.prev.next = entry.next;
		entry.prev = null;
		entry.next = null;
	}

	private void insertEntry(Entry entry) {
		entry.next = sentinel;
		entry.prev = sentinel.prev;
		sentinel.prev.next = entry;
		sentinel.prev = entry;
	}

	private int getSize(Object obj) {
		if (obj instanceof Collection)
			return ((Collection) obj).size();

		if (obj == null)
			return 0;
		return 1;
	}

	public Long getIntervalSeconds() {
		return intervalSeconds;
	}

	/**
	 * 设置刷新间隔时间 单位豪秒 小于0表示不刷新
	 * 
	 * @param intervalSeconds
	 */
	public void setIntervalSeconds(Long intervalSeconds) {
		this.intervalSeconds = intervalSeconds;
	}
}
