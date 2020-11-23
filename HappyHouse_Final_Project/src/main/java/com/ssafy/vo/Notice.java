package com.ssafy.vo;

public class Notice {
	
	private String noticeNo;
	private String writer;
	private String title;
	private String content;
	private String writeDate;
	private int count;
	
	public Notice() {}

	public Notice(String noticeNo, String writer, String title, String content, String writeDate, int count) {
		this.noticeNo = noticeNo;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.count = count;
	}

	public String getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(String noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
