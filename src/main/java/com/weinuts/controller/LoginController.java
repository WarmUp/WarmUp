package com.weinuts.controller;

import com.weinuts.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 10/15/2015.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("index")
    public ModelAndView loginProcess(){
        return new ModelAndView("/page/login.jsp");
    }

    @RequestMapping("login")
    public ModelAndView doLogin(@RequestParam String userName, @RequestParam String pasword){
        loginService.doLogin();
        return new ModelAndView("/page/login.jsp");
    }

}
