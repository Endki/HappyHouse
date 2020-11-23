package com.ssafy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.mapper.SearchMapper;
import com.ssafy.vo.HouseDeal;

@Repository
public class SearchDaoImpl implements SearchDao{

	@Autowired
	private SearchMapper sMapper;
	
	@Override
	public HouseDeal getDealInfo(String houseNo) throws Exception {
		return sMapper.getDealInfo(houseNo);
	}	

}
