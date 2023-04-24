package com.suncom.entity;

import java.util.Date;

import lombok.Data;

@Data
public class UserQuestion {

	private String year;

	private int questionid;

	private String result;

	private Date commitdate;

	private int score;

	private int disp_flg;

	private int disp_sort;

	private String question;

	@Override
	public String toString() {
		return "UserQuestion [year=" + year + ", questionid=" + questionid + ", result=" + result + ", commitdate="
				+ commitdate + ", score=" + score + ", disp_flg=" + disp_flg + ", disp_sort=" + disp_sort
				+ ", question=" + question + "]";
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getCommitdate() {
		return commitdate;
	}

	public void setCommitdate(Date commitdate) {
		this.commitdate = commitdate;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getDisp_flg() {
		return disp_flg;
	}

	public void setDisp_flg(int disp_flg) {
		this.disp_flg = disp_flg;
	}

	public int getDisp_sort() {
		return disp_sort;
	}

	public void setDisp_sort(int disp_sort) {
		this.disp_sort = disp_sort;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
