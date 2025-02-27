package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.mapper.BoardMapper;
import com.yedam.vo.BoardVO;

public class TestExe {
	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory = DataSource.getInstance();
		
		try (SqlSession session = sqlSessionFactory.openSession()){
			BoardMapper mapper = session.getMapper(BoardMapper.class);	
			
//			BoardVO brd = new BoardVO();
//			brd.setBoardTitle("mybatis 등록");
//			brd.setBoardContent("mybatis 등록함");
//			brd.setBoardWriter("작성자");
//			int cnt = mapper.insertBoard(brd);
//			if (cnt > 0) {
//				System.out.println("성공");
//				session.commit(true);
//			} else {
//				System.out.println("실패");
//			}
			
//			int boardNoDelete = 210;
//			
//			int result = mapper.deleteBoard(boardNoDelete);
//			
//			if (result > 0) {
//				System.out.println("성공");
//				session.commit(true);
//			} else {
//				System.out.println("실패");
//			}
			
			
			
			
			List<BoardVO> list = mapper.selectAll();
			for (BoardVO board : list) {
				System.out.println(board);
			}
		
		}
	}

}
