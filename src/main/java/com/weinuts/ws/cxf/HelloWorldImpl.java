package com.weinuts.ws.cxf;

import javax.jws.WebService;

/**
 * Created by kernwang on 2015/11/25.
 */
@WebService(endpointInterface = "com.weinuts.ws.cxf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
}
