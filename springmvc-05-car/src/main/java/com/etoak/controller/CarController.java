package com.etoak.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.etoak.bean.Car;
import com.etoak.service.CarService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/car")
@Slf4j
public class CarController {
	
	@Autowired
	CarService carService;
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "car/add";
	}
	
	@RequestMapping("/add")
	public String add(MultipartFile file ,Car car) throws IllegalStateException, IOException {
		String originalFilename = file.getOriginalFilename();
		log.info("文件名称 - {}",originalFilename);
		log.info("param car - {}",car);
		//新文件名称
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String newFileName = uuid +"_"+originalFilename;
		//目标文件
		File destFile = new File("d:/upload/",newFileName);
		//执行上传
		file.transferTo(destFile);
		//设置图片地址
		car.setPic("/pic/"+newFileName);
		//调用添加
		carService.addCar(car);
		
		return "redirect:/car/toAdd";
	}
	
	
	
	
	
}
