package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.vo.BoardVO;

public class TestExe {
	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory = DataSource.getInstance();
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  List<BoardVO> list = session.selectList("com.yedam.mapper.BoardMapper.selectAll");
			
		
		for(BoardVO board : list) {
			System.out.println(board);
		}
		
		}
	}

}
