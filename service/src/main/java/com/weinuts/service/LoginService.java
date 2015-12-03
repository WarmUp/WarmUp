package com.weinuts.service;

/**
 * Created by Administrator on 10/16/2015.
 */
public interface LoginService {

    public boolean doLogin();

    public boolean doLogin(String userName, String pasword);
}
