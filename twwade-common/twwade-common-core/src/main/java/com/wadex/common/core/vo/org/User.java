package com.wadex.common.core.vo.org;

import java.io.Serializable;

/**
 * <p>
 * 文件名称: User.java
 * </p>
 * <p>
 * 完成日期：Sep 16, 2010
 * </p>
 * 
 * @author user
 */
public class User implements Serializable {
	private long id;
	private String cuid;
	private String username;
	private String displayName;
	private int sex;
	private String email;
	private String mobile;
	private String phone;
	private String password;
	private String comments;
	private String hrCode;
	private int  isprivate; //0是外围，1是本系统生成

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHrCode() {
		return hrCode;
	}

	public void setHrCode(String hrCode) {
		this.hrCode = hrCode;
	}

	public String getCuid() {
		return cuid;
	}

	public void setCuid(String cuid) {
		this.cuid = cuid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getIsprivate() {
		return isprivate;
	}

	public void setIsprivate(int isprivate) {
		this.isprivate = isprivate;
	}

}
