package com.weinuts.ws.cxf.result;

import javax.xml.bind.annotation.*;

/**
 * User: ljwang
 * Date: 12/7/15
 * Time: 5:40 PM
 */
@XmlRootElement(name = "ResultResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultResponseType", propOrder = {
        "resultCode",
        "resultCodeDes"
})
public class ResultResponseForRS {
    @XmlElement(name = "resultCode")
    protected String resultCode;
    @XmlElement(name = "resultCodeDes")
    protected String resultCodeDes;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCodeDes() {
        return resultCodeDes;
    }

    public void setResultCodeDes(String resultCodeDes) {
        this.resultCodeDes = resultCodeDes;
    }
}
