package com.pyj.service;

import com.pyj.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> userAll();

    /**
     * 用户登陆
     * @param user
     * @return
     */
    List<User> userLogin(User user);

}
