package com.itheima.tms.service.impl;

import com.itheima.tms.dao.RoleDao;
import com.itheima.tms.domain.Role;
import com.itheima.tms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色的业务实现
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    /**
     * 查询所有角色
     *
     * @return
     */
    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    /**
     * 保存角色
     *
     * @param role
     */
    @Override
    public void save(Role role) {
        roleDao.save(role);
    }

    /**
     * 查找指定userid没有添加的所有权限
     *
     * @param userId
     * @return
     */
    @Override
    public List<Role> findOtherRoles(String userId) {
        return roleDao.findOtherRoles(userId);
    }

    /**
     * 添加权限到角色
     *
     * @param roleId
     * @param permissionIds
     * @throws Exception
     */
    @Override
    public void addPermissionToRole(String roleId, String[] permissionIds) throws Exception {
        for(String permissionId:permissionIds){
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }

    /**
     * 删除角色
     *
     * @param roleId
     * @throws Exception
     */
    @Override
    public void deleteRoleById(String roleId) throws Exception {

    }

    /**
     * 根据roleId获取role
     *
     * @param roleId
     * @return
     */
    @Override
    public Role findById(String roleId) {
        return roleDao.findById(roleId);
    }
}
