package com.ssafy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.service.JwtService;
import com.ssafy.service.MemberService;
import com.ssafy.vo.Member;

@MapperScan(basePackages = {"com.ssafy.mapper"})
@CrossOrigin
@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private MemberService mService;
	
	public static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@PostMapping(value="/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody Member member, HttpServletResponse response, HttpSession session) {
		Map<String, Object> resultMap = new HashMap<>();
		HttpStatus status = null;
		try {
			int loginUser = mService.login(member);
			
			if(loginUser != 0) {
//				jwt.io에서 확인
//				로그인 성공했다면 토큰을 생성한다.
				String token = jwtService.create(member.getId());
				logger.trace("로그인 토큰정보 : {}", token);
				
//				토큰 정보는 response의 헤더로 보내고 나머지는 Map에 담는다.
//				response.setHeader("auth-token", token);
				resultMap.put("auth-token", token);
				resultMap.put("user-id", member.getId());
				resultMap.put("user-nickname", member.getNickname());
//				resultMap.put("status", true);
//				resultMap.put("data", loginUser);
				status = HttpStatus.ACCEPTED;
			} else {
				resultMap.put("message", "로그인 실패");
				status = HttpStatus.ACCEPTED;
			}
		} catch (Exception e) {
			logger.error("로그인 실패 : {}", e);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
//	public int login(@RequestBody Member member) { // 로그인
//		int result = 0;
//		try{
//			result = mService.login(member);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return result;
//	}
	
	@PostMapping(value="/member")
	public int register(@RequestBody Member member) { // 회원가입
		int result = 0;
		try{
			result = mService.register(member);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@DeleteMapping(value="/member/{memberId}")
	public int delete(@PathVariable String memberId) { // 회원탈퇴
		int result = 0;
		try{
			result = mService.delete(memberId);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@PutMapping(value="/member")
	public int update(@RequestBody Member member) { // 회원 정보 수정(id기준으로 pass, email, nickname)
		int result = 0;
		try{
			result = mService.update(member);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@GetMapping(value="/member")
	public List<Member> selectAll(){// 회원 리스트 검색
		List<Member> result = null;
		try{
			result = mService.selectAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@GetMapping(value="/find/{hintanswer}")
	public String findPass(@PathVariable String hintanswer) { // 비밀번호 찾기
		String result = null;
		try{
			result = mService.findPass(hintanswer);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
}