package com.ssafy.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.service.SearchService;
import com.ssafy.vo.HouseDeal;

@MapperScan(basePackages = {"com.ssafy.mapper"})
@CrossOrigin
@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchService sService;
	
	@GetMapping(value="/deal/{houseNo}")
	public HouseDeal getDealInfo(@PathVariable String houseNo) {// house 거래정보 검색
		HouseDeal housedeal = null;
		try {
			housedeal = sService.getDealInfo(houseNo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return housedeal;
	}
}
