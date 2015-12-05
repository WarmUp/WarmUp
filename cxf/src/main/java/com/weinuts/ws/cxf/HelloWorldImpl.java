package com.weinuts.ws.cxf;



import com.weinuts.ws.cxf.exception.CxfException;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.Set;


/**
 * Created by kernwang on 2015/11/25.
 */
@WebService(endpointInterface = "com.weinuts.ws.cxf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    /**
     * WebService Context Resource binding
     * MessageContext mContext = context.getMessageContext();
       Set<String> set = mContext.keySet();
     */
    @Resource
    private WebServiceContext context;

    public String sayHi(String text) throws CxfException {
        System.out.println("sayHi called");
        PrintWebServiceContext();
        if(text.equals("error")) {
            throw new CxfException("Exception Occur");
        }
        return "Hello " + text;
    }

    /**
     * Iterator WebService Context Println
     */
    private void PrintWebServiceContext() {
        MessageContext mContext = context.getMessageContext();
        Set<String> set = mContext.keySet();
        for (String key : set) {
            System.out.println("***********" + key + "\t" +
                    mContext.get(key));
            try {
                System.out.println("+++++++++++" +
                        mContext.getScope(key));
            } catch (Exception e) {
                System.out.println("+++++++++++" + key + "is not exits");
            }
        }
    }
}


