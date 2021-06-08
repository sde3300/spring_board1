package com.btc.board1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.board1.dto.Board1Dto;
import com.btc.board1.mapper.Board1Mapper;

@Service
public class Board1ServiceImpl implements Board1Service {
	
	@Autowired
	private Board1Mapper board1Mapper;
	
	@Override
	public List<Board1Dto> selectBoardList() throws Exception {
	
		return board1Mapper.selectBoardList();
	}

}
