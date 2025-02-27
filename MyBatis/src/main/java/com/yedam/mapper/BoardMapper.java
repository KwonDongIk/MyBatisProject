package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.BoardVO;

public interface BoardMapper {
	List<BoardVO> selectAll();
	BoardVO selectBoard(int bno);
	
	int insertBoard(BoardVO board);
	
	int deleteBoard(int bno);

}
