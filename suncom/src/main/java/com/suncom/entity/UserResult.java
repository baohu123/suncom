package com.suncom.entity;

import java.util.Date;

import lombok.Data;

@Data
public class UserResult {

	private String mail;

	private String username;

	private String company;

	private String deploy;

	private String year;

	private int questionid;

	private String userinputres;

	private Date commitdate;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDeploy() {
		return deploy;
	}

	public void setDeploy(String deploy) {
		this.deploy = deploy;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getUserinputres() {
		return userinputres;
	}

	public void setUserinputres(String userinputres) {
		this.userinputres = userinputres;
	}

	public Date getCommitdate() {
		return commitdate;
	}

	public void setCommitdate(Date commitdate) {
		this.commitdate = commitdate;
	}

	@Override
	public String toString() {
		return "UserResult [mail=" + mail + ", username=" + username + ", company=" + company + ", deploy=" + deploy
				+ ", year=" + year + ", questionid=" + questionid + ", userinputres=" + userinputres + ", commitdate="
				+ commitdate + "]";
	}

}
