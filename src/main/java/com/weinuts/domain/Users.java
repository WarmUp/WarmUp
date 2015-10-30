package com.weinuts.domain;

import javax.persistence.Entity;

/**
 * Created by Administrator on 10/30/2015.
 */
@Entity
public class Users extends BaseEntity {

    private static final long serialVersionUID = 7602785183424649332L;

    /** 登入用账户名 */
    private String loginName;

    /** 登入密码 */
    private String loginPwd;

    /** 真实姓名 */
    private String userName;

    /** 性别 */
    private String gender;

    /** 手机号 */
    private String phoneNumber;

    /** 电邮账号 */
    private String email;

    /** 账户是否已激活标示 */
    private boolean validFlag;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidFlag() {
        return validFlag;
    }

    public void setValidFlag(boolean validFlag) {
        this.validFlag = validFlag;
    }
}
