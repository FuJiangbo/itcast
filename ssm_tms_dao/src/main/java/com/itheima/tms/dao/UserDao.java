package com.itheima.tms.dao;

import com.itheima.tms.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.userdetails.User;

import java.util.List;

/**
 * 用户的数据访问接口
 */
public interface UserDao {

    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return
     */
    public UserInfo findByUserName(String userName);

    /**
     * 查询所有用户
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 保存用户
     * @param userInfo
     */
    void save(UserInfo userInfo);

    /**
     * 根据id获取数据
     * @param uid
     * @return
     */
    UserInfo findById(String uid);

    /**
     * 给指定用户添加权限
     * @param userId
     * @param roleId
     */
    void addRoleToUser(@Param("userId") String userId, @Param("roleId") String roleId);
}
