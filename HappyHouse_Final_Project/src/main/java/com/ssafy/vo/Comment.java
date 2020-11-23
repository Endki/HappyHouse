package com.ssafy.vo;

public class Comment {
	private String commentId;
	private String content;
	private String houseNo;
	private String memberId;
	
	public Comment() {}

	public Comment(String commentId, String content, String houseNo, String memberId) {
		this.commentId = commentId;
		this.content = content;
		this.houseNo = houseNo;
		this.memberId = memberId;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
}
