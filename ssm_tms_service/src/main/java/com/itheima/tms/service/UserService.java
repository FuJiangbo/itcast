package com.itheima.tms.service;

import com.itheima.tms.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * 用戶的业务接口
 */
public interface UserService extends UserDetailsService {
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
     * 查询指定用户
     * @param uid
     * @return
     */
    UserInfo load(String uid);
}
