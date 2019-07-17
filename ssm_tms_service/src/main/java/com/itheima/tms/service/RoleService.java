package com.itheima.tms.service;

import com.itheima.tms.domain.Permission;
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

    /**
     * 查找指定userid没有添加的所有权限
     * @param userId
     * @return
     */
    List<Role> findOtherRoles(String userId);

    /**
     * 添加权限到角色
     * @param roleId
     * @param permissionIds
     * @throws Exception
     */
    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;

    /**
     * 删除角色
     * @param roleId
     * @throws Exception
     */
    void deleteRoleById(String roleId) throws Exception;

    /**
     * 根据roleId获取role
     * @param roleId
     * @return
     */
    Role findById(String roleId);
}
