package com.itheima.tms.service;

import com.itheima.tms.domain.Permission;

import java.util.List;

/**
 * 权限的业务接口
 */
public interface PermissionService {
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
     * @throws Exception
     */
    List<Permission> findOtherPermissions(String roleId) throws Exception;
}
