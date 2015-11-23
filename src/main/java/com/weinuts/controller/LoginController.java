package com.weinuts.controller;

import com.weinuts.domain.User;
import com.weinuts.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 10/15/2015.
 */
@Controller
@RequestMapping(value="/auth")
public class LoginController {
    @Autowired
    private LoginService loginService;
    /**
     * viewName path setted in spring bean xml
     */
    public final String LOGIN_VIEW = "login";
    public final String LOGIN_SUCCESS_VIEW = "welcome";
    public final String LOGIN_FAIL_VIEW = "deniedpage";


    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {

    }


    @RequestMapping("/index")
    public ModelAndView loginProcess(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName(LOGIN_VIEW);
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView doLogin(User user){
        System.out.println(user.toString());
        ModelAndView mv = new ModelAndView();
        mv.setViewName(LOGIN_FAIL_VIEW);
        if(loginService.doLogin(user.getLoginName() , user.getLoginPwd())){
            mv.addObject("message", "Welcome Come WeiNuts!");
            mv.addObject("userName", user.getLoginName());
            mv.setViewName(LOGIN_SUCCESS_VIEW);
        }
        return mv;
    }

    @RequestMapping("/loginFail")
    public ModelAndView deniedPage(){
        return new ModelAndView(LOGIN_FAIL_VIEW);
    }

    //set get
    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

}
