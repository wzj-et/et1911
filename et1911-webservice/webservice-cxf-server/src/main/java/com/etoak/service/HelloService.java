package com.etoak.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by 帅健健 on 2020/5/29.
 */
@WebService(serviceName="HelloService",portName = "HelloServiceWsPort")
public interface HelloService {

    String sayHello(String name);
}
