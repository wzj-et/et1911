package com.etoak.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etoak.bean.Student;
import com.etoak.bean.User;
import com.etoak.vo.ResultVo;

@RestController
@RequestMapping("/json")
public class JsonController {
	
	@PostMapping(value="/mapToJson",produces ="application/json;charset=UTF-8")
	public Object mapToJson(@RequestBody Map<String,Object> jsonMap) {
		System.out.println(jsonMap);
		
		return "{\"msg\":\"success\"}";
	}
	
	
	@PostMapping("/jsonToList")
	public Map<String,Object> jsonToList(@RequestBody List<User> userList){
		userList.forEach(x -> System.out.println(x));
		
		Map<String,Object> resultMap = new HashMap<>();
		resultMap.put("code",200);
		resultMap.put("msg","SUCCESS");
		return resultMap;
	}
	
	@PostMapping("/jsonToBean")
	public ResultVo jsonToBean(@RequestBody Student stu) {
		System.out.println(stu);
		return new ResultVo(200,"Success");
		
		
		
	}
	
	
	
}
