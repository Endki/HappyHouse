package com.ssafy.vo;

public class Member {
	private String id;
	private String pass;
	private String admin;
	private String email;
	private String nickname;
	private String passhint;
	private String hintanswer;
	
	public Member() {}

	public Member(String id, String pass, String admin, String email, String nickname, String passhint,
			String hintanswer) {
		this.id = id;
		this.pass = pass;
		this.admin = admin;
		this.email = email;
		this.nickname = nickname;
		this.passhint = passhint;
		this.hintanswer = hintanswer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPasshint() {
		return passhint;
	}

	public void setPasshint(String passhint) {
		this.passhint = passhint;
	}

	public String getHintanswer() {
		return hintanswer;
	}

	public void setHintanswer(String hintanswer) {
		this.hintanswer = hintanswer;
	}
	
}
