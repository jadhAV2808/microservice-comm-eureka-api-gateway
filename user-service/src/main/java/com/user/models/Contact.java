package com.user.models;

public class Contact {
	
	private Long cid;
	private String email;
	private String cname;
	private Long userId;

	
	public Contact(Long cid, String email, String cname, Long userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.cname = cname;
		this.userId = userId;
	}
	
	public Contact() {
		
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	
}
