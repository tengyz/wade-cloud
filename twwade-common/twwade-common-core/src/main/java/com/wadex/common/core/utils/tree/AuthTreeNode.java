package com.wadex.common.core.utils.tree;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 文件名称: AuthTreeNode.java
 * </p>
 * <p>
 * 文件描述: 业务对象 --用户
 * <p>
 * 版权所有: 版权所有(C)2010
 * </p>
 * <p>
 * 公 司: 拓维信息系统股份有限公司
 * </p>
 * <p>
 * 内容摘要: 本文件的内容是………….，包括主要……….模块、……函数及功能是………..
 * </p>
 * <p>
 * 其他说明: 其它需要说明的情况是…………….
 * </p>
 * <p>
 * 完成日期：Nov 20, 2010
 * </p>
 * 
 * @author 孟祥古
 */
public class AuthTreeNode implements Comparable
{

	private static Logger log = LoggerFactory.getLogger(AuthTreeNode.class);

	private long id;// 节点ID
	private String name;// 节点名称
	private long pid=-1;// 父亲节点id
	private String url;// 连接地址
	private int orderid;// 排序的id
	private int level;// 层级 1--省 2--公司 3--部门
	private List<AuthTreeNode> children = new ArrayList<AuthTreeNode>();// 子节点
	private String childrenStr;

	public String getChildrenStr()
	{
		return childrenStr;
	}

	public void setChildrenStr(String childrenStr)
	{
		this.childrenStr = childrenStr;
	}

	public AuthTreeNode()
	{
		super();
	}

	public AuthTreeNode(long id)
	{
		this.id = id;
	}

	public AuthTreeNode(long id, String name, long pid, String url,
			int orderid, int level, List<AuthTreeNode> children)
	{
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.url = url;
		this.orderid = orderid;
		this.level = level;
		this.children = children;
	}

	public AuthTreeNode(long id, String name, long pid, String url,
			int orderid, int level)
	{
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.url = url;
		this.orderid = orderid;
		this.level = level;
	}


	public int compareTo(Object o)
	{
		if (o instanceof AuthTreeNode)
		{
			AuthTreeNode temp = (AuthTreeNode)o;
			if(temp.getOrderid() > this.orderid)
			{
				return -1;
			}
			else if(temp.getOrderid()<this.orderid)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}

	public static Logger getLog()
	{
		return log;
	}

	public static void setLog(Logger log)
	{
		AuthTreeNode.log = log;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public long getPid()
	{
		return pid;
	}

	public void setPid(long pid)
	{
		this.pid = pid;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public int getOrderid()
	{
		return orderid;
	}

	public void setOrderid(int orderid)
	{
		this.orderid = orderid;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public List<AuthTreeNode> getChildren()
	{
		return children;
	}

	public void setChildren(List<AuthTreeNode> children)
	{
		this.children = children;
	}

}
