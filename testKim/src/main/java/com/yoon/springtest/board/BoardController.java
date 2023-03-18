package com.yoon.springtest.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
    /**
     * 게시판 화면 호출
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/board/list", method = RequestMethod.GET)
    public ModelAndView get(Model model, HttpServletRequest request) {
    	List<Map<String, String>> result = boardService.getData();
    	
    	ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/list");
		mv.addObject("result", result); 
		
        return mv;
    }
    
    @RequestMapping("/board/update")
    public @ResponseBody String getServerData(String type1,String type2,String type3,String type4,String type5,String type6) {
    	Map map = new HashMap();
    	map.put("SEQ", type1);
    	map.put("TITL", type2);
    	map.put("CNTN", type3);
    	map.put("WRTR", type4);
    	
    	boardService.updateTest(map);
    	
		return "success";
	}
    
    @RequestMapping("/board/insert")
    public @ResponseBody String getServerDatainsert(String type1,String type2,String type3,String type4,String type5,String type6) {
    	Map map = new HashMap();
    	map.put("SEQ", type1);
    	map.put("TITL", type2);
    	map.put("CNTN", type3);
    	map.put("WRTR", type4);
    	
    	boardService.insertTest(map);
    	
		return "success";
	}
}

    
    
    
    
    