package com.yoon.springtest.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSession SqlSession;

	public List<Map<String, String>> getTestValue() {  
		List<Map<String, String>> result = SqlSession.selectList("mapper.BoardMapper.selectTest");
		return result;
	}
	
	/**
	 * 게시물 업데이트
	 * @param map 업데이트 내용
	 * @throws Exception
	 */
	public void updateTest(Map map) {  
		SqlSession.update("mapper.BoardMapper.updateTest", map);
	}
	
	/**
	 * 게시물 추가
	 * @param 게시글 추가
	 * @throws Exception
	 */
	public void insertTest(Map map) {  
		SqlSession.insert("mapper.BoardMapper.insertTest", map);
	}
	
	/**
	 * 게시물 삭제
	 * @param 게시글 삭제
	 * @throws Exception
	 */
	public void deleteTest(Map map) {  
		SqlSession.delete("mapper.BoardMapper.deleteTest", map);
	}
}
