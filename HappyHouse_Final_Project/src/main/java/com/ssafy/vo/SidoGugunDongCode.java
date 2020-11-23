package com.ssafy.vo;

public class SidoGugunDongCode {

	private String sidoId;
	private String sidoName;
	private String gugunId;
	private String gugunName;
	private String dongId;
	private String dongName;
	
	public SidoGugunDongCode() {}

	public SidoGugunDongCode(String sidoId, String sidoName, String gugunId, String gugunName, String dongId,
			String dongName) {
		this.sidoId = sidoId;
		this.sidoName = sidoName;
		this.gugunId = gugunId;
		this.gugunName = gugunName;
		this.dongId = dongId;
		this.dongName = dongName;
	}

	public String getSidoId() {
		return sidoId;
	}

	public void setSidoId(String sidoId) {
		this.sidoId = sidoId;
	}

	public String getSidoName() {
		return sidoName;
	}

	public void setSidoName(String sidoName) {
		this.sidoName = sidoName;
	}

	public String getGugunId() {
		return gugunId;
	}

	public void setGugunId(String gugunId) {
		this.gugunId = gugunId;
	}

	public String getGugunName() {
		return gugunName;
	}

	public void setGugunName(String gugunName) {
		this.gugunName = gugunName;
	}

	public String getDongId() {
		return dongId;
	}

	public void setDongId(String dongId) {
		this.dongId = dongId;
	}

	public String getDongName() {
		return dongName;
	}

	public void setDongName(String dongName) {
		this.dongName = dongName;
	}
	
}
