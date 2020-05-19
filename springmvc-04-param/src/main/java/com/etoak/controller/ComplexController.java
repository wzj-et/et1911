package com.etoak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etoak.bean.Student;

/**
 * 测试java bean接收参数
 * 测试数组
 * 测试List、Map
 * @author 帅健健
 *
 */
@Controller
@RequestMapping("/complex")
public class ComplexController {
	
	//get请求
	@GetMapping("/bean")
	public String bean(Student stu,Model model) {
		System.out.println(stu);
		
		model.addAttribute("result2","使用Model传值");
		
		return "forward:/simple/simple?id=321";
	}

}
