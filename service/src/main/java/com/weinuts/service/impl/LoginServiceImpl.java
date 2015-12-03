package com.weinuts.service.impl;

import com.weinuts.domain.User;
import com.weinuts.dto.LoginDto;
import com.weinuts.service.LoginService;
import com.weinuts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 10/16/2015.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean doLogin() {
        return true;
    }

    @Override
    public boolean doLogin(String userName, String pasword) {
        User user = userService.findUserByLoginNameAndPassword(
                new LoginDto().setLoginName(userName).setLoginPwd(pasword));
        if(null == user){
            return false;
        }
        return true;
    }
}
