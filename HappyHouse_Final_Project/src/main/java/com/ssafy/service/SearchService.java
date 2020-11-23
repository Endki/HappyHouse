package com.ssafy.service;

import com.ssafy.vo.HouseDeal;

public interface SearchService {
	public HouseDeal getDealInfo(String houseNo) throws Exception; // house 거래정보 검색
}
