package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试简单参数传递
 * 1.HttpServletRequest
 * 2.基本数据类型+String
 * 
 * @author 帅健健
 *
 */
@Controller
@RequestMapping("/simple")
public class SimpleController {
	
	
	@RequestMapping("/servlet")
	public String servlet(HttpServletRequest request) {
		//接收前端参数
		String name = request.getParameter("name");
		
		if(StringUtils.isEmpty(name)) {
			name = "World!";
		}
		//向reqyest传值
		request.setAttribute("result","Hello"+name);
		//webapp/pages/param.jsp
		return "param";
		
	}
	
	/**
	 * 基本数据类型+String
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/simple",method = {RequestMethod.GET})
	public ModelAndView simple(@RequestParam(required = false,defaultValue = "1") int id,String name) {
		System.out.println("id param - " + id);
		System.out.println("name param - " + name);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result","ModelAndView传值");
		mv.setViewName("param");
		return mv;
	}
	
	

}
