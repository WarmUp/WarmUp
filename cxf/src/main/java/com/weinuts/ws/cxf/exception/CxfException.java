package com.weinuts.ws.cxf.exception;

import org.apache.cxf.common.i18n.Message;
import org.apache.cxf.interceptor.Fault;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.WebFault;

/**
 * Created by kernwang on 2015/12/5.
 */
@WebFault(name = "commonException")
public class CxfException extends Fault {
    private static final long serialVersionUID = 1562884941631450124L;

    private CxfFault details;

    public CxfException(Message message, Throwable throwable) {
        super(message, throwable);
    }


//    public CxfException(String msg) {
//        super(msg);
//        this.details.setResultCode("Server Exception Code");
//        this.details.setResultDescription(msg);
//        this.setDetails(details);
//    }

    public CxfFault getDetails() {
        return details;
    }

    public void setDetails(CxfFault details) {
        this.details = details;
    }
}
