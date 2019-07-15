package com.itheima.tms.dao;

import com.itheima.tms.domain.UserInfo;
import org.springframework.security.core.userdetails.User;

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
}
