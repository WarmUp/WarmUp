package com.weinuts.ws.cxf.restful.service;

import com.weinuts.ws.cxf.result.ResultResponseForRS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 12/7/15
 * Time: 5:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/rs/")
public class RestfulServiceImpl implements RestfullServiceInter{
    @GET
    @Produces("application/xml")
    @Path("/check")
    @Override
    public ResultResponseForRS check(@QueryParam("name") String name, @QueryParam("pwd") String pwd) {
        ResultResponseForRS responseForRS = new ResultResponseForRS();
        responseForRS.setResultCode(name);
        responseForRS.setResultCodeDes(pwd);
        return responseForRS;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
