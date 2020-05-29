package com.etoak;

import com.etoak.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by 帅健健 on 2020/5/29.
 */
public class JdkWebServer {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/hello",new HelloServiceImpl());

        System.out.println("Server start...");
    }
}
