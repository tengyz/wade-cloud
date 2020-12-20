package com.wadex.common.core.vo.auth;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 文件名称: DataItem.java
 * </p>
 * <p>
 * 文件描述: 业务对象 --字典值 T_DATA_ITEM
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
 * 完成日期：2010-10-8
 * </p>
 * 
 * @author 龙炽
 */
public class BaseDataItemVo implements Serializable
{		
	/**
	 * id
	 */
	private long id;
	/**
	 * 字典分类id
	 */
	private long cataId; 
	/**
	 * 数值
	 */
	private int value;
	/**
	 * 显示文字
	 */
	private String name;
	/**
	 * 排序
	 */
	private int seq;
	/**
	 * 注释
	 */
	private String comments;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 删除标志
	 */
	private int deleted;
	
	
	
	/**
	 * 
	 */
	public BaseDataItemVo() {
		super();
	}

	/**
	 * @param deleted
	 * @param id
	 * @param name
	 * @param seq
	 * @param value
	 */
	public BaseDataItemVo(long cataId, String comments, Date createTime,
                          int deleted, long id, String name, int seq, int value) {
		super();
		this.cataId = cataId;
		this.comments = comments;
		this.createTime = createTime;
		this.deleted = deleted;
		this.id = id;
		this.name = name;
		this.seq = seq;
		this.value = value;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCataId() {
		return cataId;
	}

	public void setCataId(long cataId) {
		this.cataId = cataId;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
}
