package com.weinuts.ws.cxf.restful.service;

import com.weinuts.ws.cxf.result.ResultResponseForRS;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * User: ljwang
 * Date: 12/7/15
 * Time: 5:38 PM
 */
@Path("/rs/")
public interface RestfullServiceInter {
     @GET
     @Produces("application/xml")
     @Path("/check")
     ResultResponseForRS check(@QueryParam("name") String name , @QueryParam("pwd") String pwd );

}
