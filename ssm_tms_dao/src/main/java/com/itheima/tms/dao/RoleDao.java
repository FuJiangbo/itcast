package com.itheima.tms.dao;

import com.itheima.tms.domain.Role;

import java.util.List;

/**
 * 角色的数据访问接口
 */
public interface RoleDao {

    /**
     * 根据用户id获取角色
     * @param uid
     * @return
     */
    public List<Role> findByUid(String uid);

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
