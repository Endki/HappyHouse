package com.ssafy.vo;

public class HouseInfo {
	
	private String houseNo;
	private String apartName;
	private String code;
	private String lat;
	private String lng;
	private String img;
	
	public HouseInfo() {}

	public HouseInfo(String houseNo, String apartName, String code, String lat, String lng, String img) {
		this.houseNo = houseNo;
		this.apartName = apartName;
		this.code = code;
		this.lat = lat;
		this.lng = lng;
		this.img = img;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getApartName() {
		return apartName;
	}

	public void setApartName(String apartName) {
		this.apartName = apartName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}
