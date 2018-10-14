package com.test.entity;

import java.util.Date;

public class UserEntity {
	
	private Integer Uid;
	private String UName;
	private String UPassword;
	private Date URegisterDate;
	
	public Integer getUid() {
		return Uid;
	}
	public void setUid(Integer uid) {
		Uid = uid;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getUPassword() {
		return UPassword;
	}
	public void setUPassword(String uPassword) {
		UPassword = uPassword;
	}
	public Date getURegisterDate() {
		return URegisterDate;
	}
	public void setURegisterDate(Date uRegisterDate) {
		URegisterDate = uRegisterDate;
	}
	
	

}
