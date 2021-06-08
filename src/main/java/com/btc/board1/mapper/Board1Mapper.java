package com.btc.board1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.btc.board1.dto.Board1Dto;

@Mapper
public interface Board1Mapper {
	List<Board1Dto> selectBoardList() throws Exception;
}
