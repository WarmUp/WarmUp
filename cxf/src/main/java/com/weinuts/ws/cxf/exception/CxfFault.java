package com.weinuts.ws.cxf.exception;

import javax.xml.bind.annotation.*;

/**
 * Created by kernwang on 2015/12/5.
 */
@XmlRootElement(name = "CXF_FAULT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SELF_FAULT", propOrder = {
        "resultCode",
        "resultDescription"
})
public class CxfFault {
    public CxfFault() {}

    @XmlElement(name = "resultCode")
    protected String resultCode;
    @XmlElement(name = "resultCodeDes")
    protected String resultDescription;



    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }
}
