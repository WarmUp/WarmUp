package com.weinuts.ws.cxf.exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kernwang on 2015/12/5.
 */
@XmlRootElement(name = "CXF_FAULT")
public class CxfFault {
    private String t;

    public CxfFault(String t) {
        this.t = t;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }
}
