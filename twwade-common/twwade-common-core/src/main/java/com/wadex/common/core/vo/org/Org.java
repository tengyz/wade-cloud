package com.wadex.common.core.vo.org;

import java.io.Serializable;

/**
 * 完成日期：Sep 16, 2010
 * </p>
 * 
 * @author user
 */
public class Org implements Serializable {
	private long id;
	private long pid;
	private int seq;
	private long companyId;
	private long provinceId;
	private String orgName;
	private String displayName;
	private int type;
	private int orgStatus;
	private String comments;
	private String erpCode;
	private int isAdmin;
	private int hasSub;
	private int isVirtual;
	/**
	 * 组织的hr编码
	 */
	private String hrCode;
	/**
	 * 组织的公司hr编码
	 */
	private String hrpCode;

	//同步，1默认同步，0 不在修改（不做同步）
	private int issync;
//	组织hr编码
	private String cuehrou;
	private int deleted;
	/**
	 * 合同系统类型
	 */
	private Integer ecmType;
	
	public int getIssync() {
		return issync;
	}

	public void setIssync(int issync) {
		this.issync = issync;
	}

	public int getIsVirtual() {
		if (isVirtual == 0 && pid == 0 && isAdmin == 0) {// 省虚拟
			isVirtual = 1;
		}
		return isVirtual;
	}

	public void setIsVirtual(int isVirtual) {
		this.isVirtual = isVirtual;
	}

	public int getHasSub() {
		return hasSub;
	}

	public String getHrCode() {
		return hrCode;
	}

	public void setHrCode(String hrCode) {
		this.hrCode = hrCode;
	}

	public String getHrpCode() {
		return hrpCode;
	}

	public void setHrpCode(String hrpCode) {
		this.hrpCode = hrpCode;
	}

	public int hasSub() {
		return hasSub;
	}

	public void setHasSub(int hasSub) {
		this.hasSub = hasSub;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getOrgStatus() {
		return orgStatus;
	}

	public void setOrgStatus(int orgStatus) {
		this.orgStatus = orgStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getErpCode() {
		return erpCode;
	}

	public void setErpCode(String erpCode) {
		this.erpCode = erpCode;
	}

	public String getCuehrou() {
		return cuehrou;
	}

	public void setCuehrou(String cuehrou) {
		this.cuehrou = cuehrou;
	}

	public int getDeleted() {
		
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Integer getEcmType() {
		return ecmType;
	}

	public void setEcmType(Integer ecmType) {
		this.ecmType = ecmType;
	}
	
}
