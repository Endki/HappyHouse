package com.ssafy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.dao.HouseMapDao;
import com.ssafy.vo.HouseInfo;
import com.ssafy.vo.SidoGugunDongCode;

@Service
public class HouseMapServiceImpl implements HouseMapService{

	@Autowired
	private HouseMapDao hmDao;
	
	@Override
	public List<SidoGugunDongCode> getSido() throws Exception {
		return hmDao.getSido();
	}

	@Override
	public List<SidoGugunDongCode> getGugunInSido(String sido) throws Exception {
		return hmDao.getGugunInSido(sido);
	}

	@Override
	public List<SidoGugunDongCode> getDongInGugun(String gugun) throws Exception {
		return hmDao.getDongInGugun(gugun);
	}

	@Override
	public List<HouseInfo> getHouseInDong(String dong) throws Exception {
		return hmDao.getHouseInDong(dong);
	}
	
}
