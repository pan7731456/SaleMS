package com.pyj.service.impl;

import com.pyj.entity.User;
import com.pyj.mapper.UserMapper;
import com.pyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Resource(name = "userMapper")
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> userAll(){
        System.out.println("?????");
        return  userMapper.userAll();
    }

    @Override
    public List<User> userLogin(User user) {
        return userMapper.userLogin(user);
    }
}
