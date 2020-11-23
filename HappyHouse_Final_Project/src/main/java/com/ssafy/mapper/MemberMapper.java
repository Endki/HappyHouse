package com.ssafy.mapper;

import java.util.List;
import java.util.Map;

import com.ssafy.vo.Member;

public interface MemberMapper {

	// 회원정보 관리
	public int login(Member member) throws Exception; // 로그인
	public int register(Member member) throws Exception; // 회원가입
	public int delete(String memberId) throws Exception; // 회원탈퇴
	public int update(Member member) throws Exception; // 회원 정보 수정
	public List<Member> selectAll() throws Exception; // 회원 리스트 검색
	public String findPass(String hintanswer) throws Exception; // 비밀번호 찾기
	
	// 즐겨찾기 관리
	// public int insertFavorities(Favorities favorities) throws Exception; // 즐겨찾기 추가
	// public int deleteFavorities(Favorities favorities) throws Exception; // 즐겨찾기 삭제
}
