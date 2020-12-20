package com.wadex.common.core.vo.org;

import java.util.Date;


/**
 * <p>
 * 文件名称: Org.java
 * <p>
 * 完成日期：Sep 16, 2010
 * </p>
 * 
 * @author user
 */

public class Staff implements java.io.Serializable {

	private long id;
	private long seq;
	private long userid;
	private String displayName;
	private int positionId;
	private String positionName;
	private long companyId;
	private String companyName;
	private long provinceId;
	private String provinceName;
	private long deptId;
	private String deptName;
	private int positionStatus;
	private int hrType;
	private int hrStatus;
	private String comments;
	private String hrCode;
	private String email;
    private String dynamicPwd;
    private Date  dynamicTm;
    private int deleted;
	private String deptHrCode;
	// Constructors

	public String getDeptHrCode() {
		return deptHrCode;
	}

	public void setDeptHrCode(String deptHrCode) {
		this.deptHrCode = deptHrCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHrCode() {
		return hrCode;
	}

	public void setHrCode(String hrCode) {
		this.hrCode = hrCode;
	}

	public long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	/** default constructor */
	public Staff() {
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSeq() {
		return this.seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public long getDeptId() {
		return this.deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public int getPositionStatus() {
		return positionStatus;
	}

	public void setPositionStatus(int positionStatus) {
		this.positionStatus = positionStatus;
	}

	public int getHrType() {
		return hrType;
	}

	public void setHrType(int hrType) {
		this.hrType = hrType;
	}

	public int getHrStatus() {
		return hrStatus;
	}

	public void setHrStatus(int hrStatus) {
		this.hrStatus = hrStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDynamicPwd() {
		return dynamicPwd;
	}

	public void setDynamicPwd(String dynamicPwd) {
		this.dynamicPwd = dynamicPwd;
	}

	public Date getDynamicTm() {
		return dynamicTm;
	}

	public void setDynamicTm(Date dynamicTm) {
		this.dynamicTm = dynamicTm;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}


}