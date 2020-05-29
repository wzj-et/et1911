package com.etoak.service;

import org.apache.ibatis.annotations.Param;

import com.etoak.bean.User;

public interface UserService {
	
	User getById(int id);
	
	User getByNameAndPasswork(String name,String password);

}
