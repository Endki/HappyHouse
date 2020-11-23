package com.ssafy.vo;

public class HouseDeal {
	
	private String dealNo;
	private String apartName;
	private int dealAmount;
	private int rentAmount;
	private String floor;
	private String buildYear;
	private double area;
	private String code;
	private String jibun;
	private String houseNo;
	
	public HouseDeal() {}

	public HouseDeal(String dealNo, String apartName, int dealAmount, int rentAmount, String floor, String buildYear,
			double area, String code, String jibun, String houseNo) {
		this.dealNo = dealNo;
		this.apartName = apartName;
		this.dealAmount = dealAmount;
		this.rentAmount = rentAmount;
		this.floor = floor;
		this.buildYear = buildYear;
		this.area = area;
		this.code = code;
		this.jibun = jibun;
		this.houseNo = houseNo;
	}

	public String getDealNo() {
		return dealNo;
	}

	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}

	public String getApartName() {
		return apartName;
	}

	public void setApartName(String apartName) {
		this.apartName = apartName;
	}

	public int getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(int dealAmount) {
		this.dealAmount = dealAmount;
	}

	public int getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getJibun() {
		return jibun;
	}

	public void setJibun(String jibun) {
		this.jibun = jibun;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
}
