package com.etoak.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import com.etoak.bean.User;

public class LoginInterceptor implements HandlerInterceptor {
	
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		User user=(User) session.getAttribute("user");
		
		if(ObjectUtils.isEmpty(user)) {
			String path = request.getContextPath();
			response.sendRedirect(path+"/user/toLogin");
			return false;
		}
		return true;
	}

}
