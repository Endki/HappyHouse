package com.ssafy.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.mapper.MemberMapper;
import com.ssafy.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	private MemberMapper mMapper;
	
	@Override
	public int login(Member member) throws Exception {
		return mMapper.login(member);
	}

	@Override
	public int register(Member member) throws Exception {
		return mMapper.register(member);
	}

	@Override
	public int delete(String memberId) throws Exception {
		return mMapper.delete(memberId);
	}

	@Override
	public int update(Member member) throws Exception {
		return mMapper.update(member);
	}

	@Override
	public List<Member> selectAll() throws Exception {
		return mMapper.selectAll();
	}

	@Override
	public String findPass(String hintanswer) throws Exception {
		return mMapper.findPass(hintanswer);
	}

}
