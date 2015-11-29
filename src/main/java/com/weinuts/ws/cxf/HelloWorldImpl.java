package com.weinuts.ws.cxf;

import org.mvel2.MVEL;
import org.mvel2.ParserContext;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

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


