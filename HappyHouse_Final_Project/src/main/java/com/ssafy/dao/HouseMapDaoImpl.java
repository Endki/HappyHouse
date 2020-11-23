package com.ssafy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.mapper.HouseMapMapper;
import com.ssafy.vo.HouseInfo;
import com.ssafy.vo.SidoGugunDongCode;

@Repository
public class HouseMapDaoImpl implements HouseMapDao{

	@Autowired
	private HouseMapMapper hmMapper;
	
	@Override
	public List<SidoGugunDongCode> getSido() throws Exception {
		return hmMapper.getSido();
	}

	@Override
	public List<SidoGugunDongCode> getGugunInSido(String sido) throws Exception {
		return hmMapper.getGugunInSido(sido);
	}

	@Override
	public List<SidoGugunDongCode> getDongInGugun(String gugun) throws Exception {
		return hmMapper.getDongInGugun(gugun);
	}

	@Override
	public List<HouseInfo> getHouseInDong(String dong) throws Exception {
		return hmMapper.getHouseInDong(dong);
	}

}
