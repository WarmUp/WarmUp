package com.weinuts.ws.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import warmup.com.Exception_Exception;
import warmup.com.HelloWorld;
import warmup.com.ResultResponseType;

import javax.xml.namespace.QName;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 12/7/15
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){

        /**
         * Client Access Method One with Stub
         */
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost:8080/WarmUp/ws/HelloWorld");
        factoryBean.setServiceClass(HelloWorld.class);
        HelloWorld helloWorld = (HelloWorld) factoryBean.create();
        try {
            ResultResponseType responseType = helloWorld.sayHi("error");
            System.out.println(responseType.getCxfFault().getResultCode());
            System.out.println(responseType.getCxfFault().getResultCodeDes());
        } catch (Exception_Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
