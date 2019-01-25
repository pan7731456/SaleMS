package com.pyj.controller;

import com.pyj.entity.User;
import com.pyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/all")
    public ModelAndView userAll(){
        ModelAndView mv = null;
        try {
            mv = new ModelAndView("show");
            List<User> userList = userService.userAll();
            System.out.println(userList);
            mv.addObject("user",userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView userLogin(User user){
        ModelAndView mv = null;
        try {
            mv = new ModelAndView("show");
            List<User> userList = userService.userLogin(user);
            System.out.println(userList);
            mv.addObject("user",userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

}
