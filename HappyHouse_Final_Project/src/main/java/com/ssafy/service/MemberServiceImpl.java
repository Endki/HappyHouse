package com.ssafy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.dao.MemberDao;
import com.ssafy.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao mDao;
	
	@Override
	public int login(Member member) throws Exception {
		return mDao.login(member);
	}

	@Override
	public int register(Member member) throws Exception {
		return mDao.register(member);
	}

	@Override
	public int delete(String memberId) throws Exception {
		return mDao.delete(memberId);
	}

	@Override
	public int update(Member member) throws Exception {
		return mDao.update(member);
	}

	@Override
	public List<Member> selectAll() throws Exception {
		return mDao.selectAll();
	}

	@Override
	public String findPass(String hintanswer) throws Exception {
		return mDao.findPass(hintanswer);
	}
	
}
