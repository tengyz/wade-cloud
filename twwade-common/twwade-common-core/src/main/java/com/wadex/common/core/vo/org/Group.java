package com.wadex.common.core.vo.org;

/**
 * <p>
 * 文件名称: Org.java
 * </p>
 * <p>
 * 文件描述: 业务对象 --组
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
 * 完成日期：Sep 16, 2010
 * </p>
 * 
 * @author user
 */

public class Group implements java.io.Serializable {
	private long id;
	private int isvalid;
	private int allowshow;
	private String name;
	private String comments;
	private long creator;
	private long companyId; 
	private long provinceId; 
	private int type;
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getCreator() {
		return this.creator;
	}

	public void setCreator(long creator) {
		this.creator = creator;
	}
	
	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public int getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(int isvalid) {
		this.isvalid = isvalid;
	}

	public int getAllowshow() {
		return allowshow;
	}

	public void setAllowshow(int allowshow) {
		this.allowshow = allowshow;
	}
}