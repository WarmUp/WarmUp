package com.weinuts.ws.cxf.exception;


import com.weinuts.ws.cxf.result.ResultResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by kernwang on 2015/12/6.
 */
@Provider
public class InvokeFaultExceptionMapper extends Exception implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        ResultResponse response = new ResultResponse();
//        response.setResultCode("0000errror");
//        response.setResultDescription(exception.getMessage());
        return Response.status(Response.Status.OK).entity(response).build();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
