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
}
