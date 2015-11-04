package com.weinuts.controller;

import com.weinuts.domain.User;
import com.weinuts.dto.LoginDto;
import com.weinuts.service.LoginService;
import com.weinuts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by Administrator on 10/15/2015.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public ModelAndView loginProcess(){
        return new ModelAndView("/page/login.jsp");
    }

    @RequestMapping("login")
    public ModelAndView doLogin(@ModelAttribute("loginDto") LoginDto loginDto){

        User user = userService.findUserByLoginNameAndPassword(loginDto);
        if(null == user){
            return new ModelAndView(new RedirectView("/pages/welcome.jsp"));
        }else{
            return new ModelAndView("/login");
        }
    }

}
