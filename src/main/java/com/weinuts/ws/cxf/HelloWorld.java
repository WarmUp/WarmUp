package com.weinuts.ws.cxf;

import javax.jws.WebService;

/**
 * Created by kernwang on 2015/11/25.
 */
@WebService
public interface HelloWorld {
    String sayHi(String text);
}
