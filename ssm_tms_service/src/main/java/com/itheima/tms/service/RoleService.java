package com.itheima.tms.service;

import com.itheima.tms.domain.Role;

import java.util.List;

/**
 * 角色的业务接口
 */
public interface RoleService {

    /**
     * 查询所有角色
     * @return
     */
    public List<Role> findAll();


    /**
     * 保存角色
     * @param role
     */
    public void save(Role role);


}
