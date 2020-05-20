package com.etoak.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@PostMapping("array")
	public String array(String[] hobby,ModelMap modelMap) {
		for(String hobbyStr : hobby) {
			System.out.println("hobby - "+hobbyStr );
		}
		
		modelMap.addAttribute("result","使用ModelMap传参");
		return "param";
	}
	
	@PostMapping("list")
	public String list(Student student,Map<String,Object> map) {
		
		List<String> hobbyList = student.getHobbyList();
		//当不为空时遍历
		if(!CollectionUtils.isEmpty(hobbyList)) {
			hobbyList.forEach(x -> System.out.println(x));
		}
		
		map.put("result","使用List传参");
		return "param";
	}
	
	@PostMapping(value="/map",produces= {"text/plain"})
	@ResponseBody  
	public String map(Student student){
		System.out.println(student.getStuMap());
		
		return "success";
	}
	
	
	
	

}
