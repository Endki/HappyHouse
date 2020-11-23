package com.ssafy.mapper;

import com.ssafy.vo.HouseDeal;

public interface SearchMapper {
	public HouseDeal getDealInfo(String houseNo) throws Exception;
}
