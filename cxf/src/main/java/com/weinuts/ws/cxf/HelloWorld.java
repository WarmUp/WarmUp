package com.weinuts.ws.cxf;

import com.weinuts.ws.cxf.result.ResultResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by kernwang on 2015/11/25.
 */
@WebService(targetNamespace = "http://com.warmup")
public interface HelloWorld {
    @WebMethod(operationName = "sayHi")
    @WebResult(name = "ResultResponse")
    ResultResponse sayHi(@WebParam(name = "INPUT_TEXT") String text) throws Exception;
}
