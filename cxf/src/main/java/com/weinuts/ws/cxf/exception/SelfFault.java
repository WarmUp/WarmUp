package com.weinuts.ws.cxf.exception;


import org.apache.cxf.common.i18n.Message;
import org.apache.cxf.interceptor.Fault;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 12/6/15
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class SelfFault extends Fault {
    public SelfFault(Message message, Throwable throwable) {
        super(message, throwable);
    }
}
