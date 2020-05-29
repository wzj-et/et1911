package com.etoak;

import com.etoak.service.HelloService;
import com.etoak.service.impl.HelloServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by 帅健健 on 2020/5/29.
 */
public class CxfServer {
    public static void main(String[] args) {
        //创建
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        //设置地址
        factory.setAddress("http://localhost:8000/hello");
        //设置发布接口
        factory.setServiceClass(HelloService.class);
        //
        factory.setServiceBean(new HelloServiceImpl());
        //
        Server server = factory.create();
        server.start();
        System.out.println("Server start");
    }
}
