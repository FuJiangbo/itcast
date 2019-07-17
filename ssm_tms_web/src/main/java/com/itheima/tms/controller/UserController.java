package com.itheima.tms.controller;

import com.itheima.tms.domain.UserInfo;
import com.itheima.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<UserInfo> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "user-list";
    }

    @RequestMapping("/save")
    public String save(UserInfo userInfo){
        userService.save(userInfo);
        return "redirect:/user/findAll.do";
    }

    @RequestMapping("/load")
    public String load(Model model, @RequestParam(name = "uid") String uid){
        UserInfo userInfo = userService.load(uid);
        model.addAttribute("user", userInfo);
        return "user-detail";
    }
}
