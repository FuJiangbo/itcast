package com.itheima.tms.dao;

import com.itheima.tms.domain.Permission;

import java.util.List;

/**
 * 权限的数据访问接口
 */
public interface PermissionDao {

    /**
     * 根据roleId获取权限列表
     * @param rId
     * @return
     */
    List<Permission> findByRoleId(String rId);

    /**
     * 查询所有权限
     * @return
     */
    List<Permission> findAll();

    /**
     * 保存权限
     * @param permission
     */
    void save(Permission permission);

    /**
     * 查询所有与指定角色没有关系的权限列表
     * @param roleId
     * @return
     */
    List<Permission> findOtherPermissions(String roleId);
}
