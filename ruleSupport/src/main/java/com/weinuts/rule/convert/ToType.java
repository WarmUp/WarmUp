package com.weinuts.rule.convert;




/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/27/15
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class ToType implements org.mvel2.ConversionHandler {

    public ToType(String error , String errorDescription){
       this.error = error;
       this.errorDescription = errorDescription;
    }
    @Override
    public Object convertFrom(Object in) {
        if(in instanceof Boolean){
            this.setResult(String.valueOf(in));
        }
        return this;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean canConvertFrom(Class cls) {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private String error = "errorCode_1";
    private String errorDescription;
    private String result;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
