package com.yoon.springtest.board;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
    
    @RequestMapping(value = "/board/list", method = RequestMethod.GET)
    public ModelAndView list(Model modelm, HttpServletRequest request) {
    	List<Map<String, String>> result = boardService.getData();
    	
    	ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/list");
		mv.addObject("result", result); 
		
        return mv;
    }
}
