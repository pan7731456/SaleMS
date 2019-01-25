package com.pyj.mapper;

import com.pyj.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: pyj
 * @desc:
 * @date: created in 2019-01-23 上午10:04
 * @modifed by:
 */

@Repository("userMapper")
public interface UserMapper {

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> userAll();

    /**
     * 获取输入的用户名信息进行登陆
     * @param user 用户名
     * @return
     */
    List<User> userLogin(User user);
}
