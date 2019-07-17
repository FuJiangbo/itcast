package com.itheima.tms.controller;

import com.itheima.tms.domain.Role;
import com.itheima.tms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Role> roleList = roleService.findAll();
        model.addAttribute("roleList", roleList);
        return "role-list";
    }

    @RequestMapping("/save")
    public String findAll(Role role) {
        roleService.save(role);
        return "redirect:/role/findAll.do";
    }
}
