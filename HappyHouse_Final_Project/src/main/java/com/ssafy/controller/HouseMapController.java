package com.ssafy.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.service.HouseMapService;
import com.ssafy.vo.HouseInfo;
import com.ssafy.vo.SidoGugunDongCode;

@MapperScan(basePackages = {"com.ssafy.mapper"})
@CrossOrigin
@RestController
@RequestMapping("/houseMap")
public class HouseMapController {
	
	@Autowired
	private HouseMapService hmService;
	
	@GetMapping(value="/sido")
	List<SidoGugunDongCode> getSido(){ // 시/도 리스트 검색
		List<SidoGugunDongCode> list = null;
		try {
			list = hmService.getSido();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping(value="/gugun/{sido}")
	List<SidoGugunDongCode> getGugunInSido(@PathVariable String sido){ // 구/군 리스트 검색
		List<SidoGugunDongCode> list = null;
		try {
			list = hmService.getGugunInSido(sido);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping(value="/dong/{gugun}")
	List<SidoGugunDongCode> getDongInGugun(@PathVariable String gugun){ // 동 리스트 검색
		List<SidoGugunDongCode> list = null;
		try {
			list = hmService.getDongInGugun(gugun);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping(value="/house/{dong}")
	List<HouseInfo> getHouseInDong(@PathVariable String dong){ // house 리스트 검색
		List<HouseInfo> list = null;
		try {
			list = hmService.getHouseInDong(dong);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
