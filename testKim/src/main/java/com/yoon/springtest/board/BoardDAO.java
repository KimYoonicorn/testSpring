package com.yoon.springtest.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
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
}
