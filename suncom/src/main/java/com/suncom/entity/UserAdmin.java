package com.suncom.entity;

import lombok.Data;

@Data
public class UserAdmin {

	private String userid;

	private String password;

	private String mail;

	private int pkid;

	@Override
	public String toString() {
		return "UserAdmin [userid=" + userid + ", password=" + password + ", mail=" + mail + ", pkid=" + pkid + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPkid() {
		return pkid;
	}

	public void setPkid(int pkid) {
		this.pkid = pkid;
	}

}
