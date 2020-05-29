package com.etoak.service.impl;

import com.etoak.service.HelloService;

import javax.jws.WebService;

/**
 * Created by 帅健健 on 2020/5/29.
 */
@WebService(serviceName="HelloService",portName = "HelloServiceWsPort")
public class HelloServiceImpl implements HelloService{

    public String sayHello(String name){
        System.out.println("服务端被调用o");
        return "Hello"+name;
    }
}
