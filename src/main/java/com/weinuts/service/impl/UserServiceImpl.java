package com.weinuts.service.impl;

import com.weinuts.dao.UserRepository;
import com.weinuts.domain.User;
import com.weinuts.dto.LoginDto;
import com.weinuts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 11/4/2015.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User uuser = userRepository.findOne(user.getId());
        if(null != null){
            user.setId(uuser.getId());
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public User deleteUser(int id) {
        User duser = userRepository.findOne(id);
        if(null != duser){
            userRepository.delete(duser);
        }
        return duser;
    }

    @Override
    public User getUser(int id) {
        User fuser = userRepository.findOne(id);
        return fuser;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public List<User> getUsersByConditionNoPage(String phone, String address) {
//        return userRepository.findTop2ByPhoneStartingWithAndAddressContainingOrderByPhoneDesc(phone, address);

        //return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(Direction.ASC,"phone"));

        //Order order = new Order(Direction.ASC,"phone");
        //return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(order));

        //List<Order> orders = new ArrayList<Order>();
        //orders.add(new Order(Direction.DESC,"name"));
        //orders.add(new Order(Direction.ASC,"phone"));
        //return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(orders);

        return null;
    }

    @Override
    public Page<User> getUsersByConditionWithPage(String phone, String address, Integer page, Integer pageSize) {
        //不排序
//        Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize));

        //排序

        //第一种排序方式
        //Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize,new Sort(Direction.ASC,"name","phone")));

        //第二种排序方式
        //Order order = new Order(Direction.ASC,"phone");
        //Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize,new Sort(order));

        //第三种排序方式
        //List<Order> orders = new ArrayList<Order>();
        //orders.add(new Order(Direction.DESC,"name"));
        //orders.add(new Order(Direction.ASC,"phone"));
        //Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize,new Sort(orders));

//        return userPage;
        return null;
    }

    @Override
    public User findUserByLoginNameAndPassword(LoginDto loginDto) {
        User user = null;
        if("admin".equals(loginDto.getLoginName())&&"admin".equals(loginDto.getLoginPwd())){
            user = new User();
            user.setId(1);
            user.setLoginName(loginDto.getLoginName());
            user.setLoginPwd(loginDto.getLoginPwd());
        }
        return user;
    }
}
