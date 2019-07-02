package com.demotest.example.demoOne.web;

import com.demotest.example.demoOne.domain.User;
import com.demotest.example.demoOne.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户控制层
 *
 * Created by jisheng on 02/07/2019
 */

@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getUserList(ModelMap map){
        map.addAttribute("userList",userService.findAll());
        return "userlist";
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String createUserForm(ModelMap map){
        map.addAttribute("user",new User());
        map.addAttribute("action","create");
        return "userForm";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        userService.insertByUser(user);
        return "redirect:/users/";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable Long id,ModelMap map){
        map.addAttribute("user",userService.findById(id));
        map.addAttribute("action","update");
        return "userForm";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable Long id){
        userService.delete(id);
        return "redirect:/users/";
    }
}
