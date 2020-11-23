package com.ssafy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.dao.SearchDao;
import com.ssafy.vo.HouseDeal;

@Service
public class SearchServiceImpl implements SearchService{

	@Autowired
	private SearchDao sDao;
	
	@Override
	public HouseDeal getDealInfo(String houseNo) throws Exception {
		return sDao.getDealInfo(houseNo);
	}
	
}
