package com.itheima.tms.dao;

import com.itheima.tms.domain.UserInfo;
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
}
