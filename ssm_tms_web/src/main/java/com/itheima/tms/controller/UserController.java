package com.itheima.tms.controller;

import com.itheima.tms.domain.Role;
import com.itheima.tms.domain.UserInfo;
import com.itheima.tms.service.RoleService;
import com.itheima.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

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

    //查询用户以及用户可以添加的角色
    @RequestMapping("/findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id", required = true) String userid) throws Exception {
        ModelAndView mv = new ModelAndView();
        //1.根据用户id查询用户
        UserInfo userInfo = userService.load(userid);
        //2.根据用户id查询可以添加的角色
        List<Role> otherRoles = roleService.findOtherRoles(userid);

        mv.addObject("user", userInfo);
        mv.addObject("roleList", otherRoles);
        mv.setViewName("user-role-add");

        return mv;
    }

    //给用户添加角色
    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userId", required = true) String userId, @RequestParam(name = "ids", required = true) String[] roleIds) {
        userService.addRoleToUser(userId, roleIds);
        return "redirect:findAll.do";
    }
}
