package com.btc.board1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.btc.board1.dto.Board1Dto;
import com.btc.board1.service.Board1Service;

// @Controller은 해당 파일이 Controller 임을 나타내는 어노테이션
// Soap 타입의 웹 서버로 동작하도록 지정
@Controller
public class Board1Controller {

	@Autowired
	private Board1Service board1Service;
	
//	@RequestMapping은 매개변수로 넘어온 문자열을 URL과 연동하고, 아래의 메서드와 연동
	@RequestMapping("/test")
	public ModelAndView test() throws Exception {
//		ModelAndView 클래스는 데이터와 사용자 뷰 부분을 설정하는 클래스
//		생성자의 매개변수로 html의 위치와 파일명을 입력
//		resource 아래의 template 폴더를 뜻함 view의 최상위 폴더(/)로 인식함 
		ModelAndView mv = new ModelAndView("/test");
		
		return mv;
	}


	@RequestMapping("/board1/openBoardList.do")
	public ModelAndView openBoardList() throws Exception {
		ModelAndView mv = new ModelAndView("/board1/boardList");
		
		List<Board1Dto> list = board1Service.selectBoardList();
		mv.addObject("dataList", list);
		
		return mv;
	}
}
