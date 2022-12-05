package com.ssafy.notice.model.dto;

import lombok.Data;

@Data
public class Notice {
	private int articleNo;
	private String userId;
	private String subject;
	private String content;
	private int hit;
	private String registerTime;
	public Notice(int articleNo, String userId, String subject, String content, int hit, String registerTime) {
		super();
		this.articleNo = articleNo;
		this.userId = userId;
		this.subject = subject;
		this.content = content;
		this.hit = hit;
		this.registerTime = registerTime;
	}
	
	
	
	
	public Notice(int articleNo, String userId, String subject, String content) {
		super();
		this.articleNo = articleNo;
		this.userId = userId;
		this.subject = subject;
		this.content = content;
	}




	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	
	
	
	
}
