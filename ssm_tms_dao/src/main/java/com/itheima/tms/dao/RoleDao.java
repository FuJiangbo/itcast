package com.itheima.tms.dao;

import com.itheima.tms.domain.Role;
import org.apache.ibatis.annotations.Param;

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

    //@Select("select * from role where id not in (select roleId from users_role where userId=#{userId})")

    /**
     * 查找指定userid没有添加的所有权限
     * @param userId
     * @return
     */
    List<Role> findOtherRoles(String userId);

    /**
     * 根据roleId获取Role
     * @param roleId
     * @return
     */
    Role findById(String roleId);

    /**
     * 给角色绑定权限
     * @param roleId
     * @param permissionId
     */
    void addPermissionToRole(@Param("roleId") String roleId, @Param("permissionId") String permissionId);


}
