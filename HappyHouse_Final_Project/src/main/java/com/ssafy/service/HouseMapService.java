package com.ssafy.service;

import java.util.List;

import com.ssafy.vo.HouseInfo;
import com.ssafy.vo.SidoGugunDongCode;

public interface HouseMapService {
	
	List<SidoGugunDongCode> getSido() throws Exception; // 시/도 리스트 검색
	List<SidoGugunDongCode> getGugunInSido(String sido) throws Exception; // 구/군 리스트 검색
	List<SidoGugunDongCode> getDongInGugun(String gugun) throws Exception; // 동 리스트 검색
	List<HouseInfo> getHouseInDong(String dong) throws Exception; // house 리스트 검색
}
