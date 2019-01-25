package com.pyj.mapper.impl;

import com.pyj.entity.User;
import com.pyj.mapper.MysqlDAO;
import com.pyj.mapper.UserMapper;

import java.util.List;

/**
 * @author: pyj
 * @desc:
 * @date: created in 2019-01-23 上午10:09
 * @modifed by:
 */

public class UserMapperImpl extends MysqlDAO implements UserMapper {


    @Override
    public List<User> userAll() {
        return getSqlSessionTemplate().selectList("userAll");
    }

    @Override
    public List<User> userLogin(User user) {
        return getSqlSessionTemplate().selectList("userLogin",user);
    }
}
