package com.yoon.springtest.board;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardService {
	@Autowired
	BoardDAO boardDAO;
	
	/**
	 * DB에 있는 데이터를 가져온다.
	 */
	public List<Map<String, String>> getData() {
		List<Map<String, String>> listData = boardDAO.getTestValue();
//		String result = "";
//		for(int i = 0; i < listData.size(); i++) {
//			if("제목1".equals(listData.get(i))) {
//				result = listData.get(i);
//				break;
//			}
//		}
		return listData;
	}
}
