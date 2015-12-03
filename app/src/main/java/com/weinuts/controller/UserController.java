package com.weinuts.controller;

import com.weinuts.dao.UserRepository;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/23/15
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */

public class UserController {

    private UserRepository userRepository;
    private String viewA;
    private String viewB;
    private String viewC;
    private String viewD;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getViewA() {
        return viewA;
    }

    public void setViewA(String viewA) {
        this.viewA = viewA;
    }

    public String getViewB() {
        return viewB;
    }

    public void setViewB(String viewB) {
        this.viewB = viewB;
    }

    public String getViewC() {
        return viewC;
    }

    public void setViewC(String viewC) {
        this.viewC = viewC;
    }

    public String getViewD() {
        return viewD;
    }

    public void setViewD(String viewD) {
        this.viewD = viewD;
    }
}
