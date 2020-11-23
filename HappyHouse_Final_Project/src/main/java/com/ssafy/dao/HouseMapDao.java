package com.ssafy.dao;

import java.util.List;

import com.ssafy.vo.HouseInfo;
import com.ssafy.vo.SidoGugunDongCode;

public interface HouseMapDao {

	List<SidoGugunDongCode> getSido() throws Exception;
	List<SidoGugunDongCode> getGugunInSido(String sido) throws Exception;
	List<SidoGugunDongCode> getDongInGugun(String gugun) throws Exception;
	List<HouseInfo> getHouseInDong(String dong) throws Exception;
}
