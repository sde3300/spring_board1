package com.btc.board1.service;

import java.util.List;

import com.btc.board1.dto.Board1Dto;

public interface Board1Service {
	List<Board1Dto> selectBoardList() throws Exception;

}
