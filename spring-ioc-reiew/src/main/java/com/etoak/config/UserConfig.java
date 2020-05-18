package com.etoak.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.action.UserAction;
import com.etoak.service.UserService;
/**
 * @Configuration 相当于 beans 标签
 * 表示这是一个spring IOC 容器
 * @author 帅健健
 *
 */
@Configuration 
public class UserConfig {
	
	//注册一个bean
	@Bean("userService")
	public UserService userService() {
		return new UserService();
	}
	
	@Bean
	public UserAction userAction(@Qualifier("userService")UserService userService) {
		UserAction userAction = new UserAction();
		userAction.setUserService(userService);
		return userAction;
	}

}
