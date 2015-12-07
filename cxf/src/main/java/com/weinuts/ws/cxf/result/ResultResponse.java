package com.weinuts.ws.cxf.result;

import com.weinuts.ws.cxf.exception.CxfFault;

import javax.xml.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 12/6/15
 * Time: 3:18 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "ResultResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultResponseType", propOrder = {
        "result",
        "cxfFault"
})

public class ResultResponse {

    @XmlElement(name = "result")
    protected String result;
    @XmlElement(name = "cxfFault")
    protected CxfFault cxfFault;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CxfFault getCxfFault() {
        return cxfFault;
    }

    public void setCxfFault(CxfFault cxfFault) {
        this.cxfFault = cxfFault;
    }
}
