package com.ssafy.dao;

import com.ssafy.vo.HouseDeal;

public interface SearchDao {

	public HouseDeal getDealInfo(String houseNo) throws Exception;
}
