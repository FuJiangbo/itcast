package com.itheima.tms.service.impl;

import com.itheima.tms.dao.RoleDao;
import com.itheima.tms.dao.UserDao;
import com.itheima.tms.domain.Role;
import com.itheima.tms.domain.UserInfo;
import com.itheima.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户的业务实现
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //根据用户名称获取用户对象
        UserInfo userInfo = userDao.findByUserName(userName);

        //将用户信息封装为UserDetail
        /*User user = new User(userInfo.getUsername(), "{noop}"+userInfo.getPassword(),
                getRolesAuthority(userInfo.getRoles()));*/

        User user = new User(userInfo.getUsername(), userInfo.getPassword(),
                userInfo.getStatus() == 0 ? false : true ,
                true,
                true,
                true,
                getRolesAuthority(userInfo.getRoles()));

        //返回UserDetail
        return user;
    }

    private List<GrantedAuthority> getRolesAuthority(List<Role> roles) {
        List<GrantedAuthority> aList = new ArrayList<GrantedAuthority>();
        if(roles != null){
            for (Role role : roles) {
                aList.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
            }
        }
        return aList;
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    /**
     * 保存用户
     *
     * @param userInfo
     */
    @Override
    public void save(UserInfo userInfo) {
        //对密码进行加密
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        //保存用户
        userDao.save(userInfo);

    }

    /**
     * 查询指定用户
     *
     * @param uid
     * @return
     */
    @Override
    public UserInfo load(String uid) {
        return userDao.findById(uid);
    }

    /**
     * 给指定用户添加权限
     *
     * @param userId
     * @param roleIds
     */
    @Override
    public void addRoleToUser(String userId, String[] roleIds) {
        if(roleIds != null){
            for (String roleId : roleIds) {
                userDao.addRoleToUser(userId, roleId);
            }
        }
    }
}
