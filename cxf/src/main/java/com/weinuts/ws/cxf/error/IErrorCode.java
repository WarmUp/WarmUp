package com.weinuts.ws.cxf.error;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 12/6/15
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
public enum IErrorCode implements ErrorCode{
    ERROR_0001("ERROR_0001 des.", "ERROR_0001"),
    ERROR_0002("ERROR_0001 des.", "ERROR_0002"),
    ERROR_0003("ERROR_0001 des.", "ERROR_0003");

    private String defaultErrorDescription;
    private String errorCode;

    IErrorCode(String defaultDesc, String code){
        defaultErrorDescription = defaultDesc;
        errorCode = code;
    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }
}
