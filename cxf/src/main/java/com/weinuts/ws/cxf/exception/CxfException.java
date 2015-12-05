package com.weinuts.ws.cxf.exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.WebFault;

/**
 * Created by kernwang on 2015/12/5.
 */
@WebFault(name = "commonException")
public class CxfException extends Exception{
    private static final long serialVersionUID = 1562884941631450124L;
    private CxfFault details;

    public CxfException(String msg) {
        super(msg);
    }

    public CxfFault getDetails() {
        return details;
    }

}
