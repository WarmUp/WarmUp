package com.weinuts.ws.cxf;



import com.weinuts.ws.cxf.exception.CxfFault;
import com.weinuts.ws.cxf.result.ResultResponse;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.Set;


/**
 * Created by kernwang on 2015/11/25.
 */
@WebService(endpointInterface = "com.weinuts.ws.cxf.HelloWorld" , targetNamespace = "http://com.warmup")
public class HelloWorldImpl implements HelloWorld {
    /**
     * WebService Context Resource binding
     * MessageContext mContext = context.getMessageContext();
       Set<String> set = mContext.keySet();
     */
    @Resource
    private WebServiceContext context;

    @WebMethod(action = "sayHi")
    public ResultResponse sayHi(String text) throws Exception {
        PrintWebServiceContext();
        ResultResponse response = new ResultResponse();
        if(text.equals("error")) {
            CxfFault cxfFault = new CxfFault();
            response.setCxfFault(cxfFault);
            cxfFault.setResultCode("0000errror");
            cxfFault.setResultDescription("0000errror desc");
            //throw new CxfException("Exception Occur");
        }else if(text.equals("throw")){
            text= null;
            text.trim();
        }
        else{
            response.setResult("Hello " + text);
        }
        return response;
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


