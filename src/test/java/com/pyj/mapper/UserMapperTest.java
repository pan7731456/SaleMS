package com.pyj.mapper;

import com.pyj.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired(required = false)
    UserMapper userMapper;

    @Test
    public void userLogin(){
        User user = new User();
        user.setuName("pan");
        List<User> userList= userMapper.userLogin(user);
        System.out.println(userList);
    }

}