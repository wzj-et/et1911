package com.etoak.service.impl;

import com.etoak.service.HelloService;

import javax.jws.WebService;

/**
 * Created by 帅健健 on 2020/5/29.
 */

@WebService
public class HelloServiceImpl  implements HelloService {

    public  String  sayHello(String name){
        System.out.println("sayHello!");
        return "Hello" + name;
    }

}
