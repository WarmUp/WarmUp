package com.weinuts.service;

import com.weinuts.domain.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Administrator on 11/4/2015.
 */
public interface UserService {

    /** 添加用户 */
    public void addUser(User user);

    /** 修改用户 */
    public User updateUser(User user);

    /** 删除用户,根据用户编号删除 */
    public User deleteUser(int id);

    /** 查询单个用户 */
    public User getUser(int id);

    /** 查询所有用户 */
    public List<User> getUsers();

    /** 不分页带条件查询 */
    public List<User> getUsersByConditionNoPage(String phone,String address);

    /** 带分页条件查询(需要得到用户列表并且得到分页信息) */
    public Page<User> getUsersByConditionWithPage(String phone,String address,Integer page,Integer pageSize);

    /** 带分页条件查询(得到用户列表) */
    //public List<User> getUsersByCondition(String phone,String address,Integer page,Integer pageSize);
}
