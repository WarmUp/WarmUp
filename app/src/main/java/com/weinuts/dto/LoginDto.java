package com.weinuts.dto;

/**
 * Created by Administrator on 10/16/2015.
 */
public class LoginDto {

    public String loginName;

    public String loginPwd;

    public String getLoginName() {
        return loginName;
    }

    public LoginDto setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public LoginDto setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
        return this;
    }
}
