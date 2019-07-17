package com.itheima.tms.service.impl;

import com.itheima.tms.dao.PermissionDao;
import com.itheima.tms.domain.Permission;
import com.itheima.tms.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    /**
     * 查询所有权限
     *
     * @return
     */
    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    /**
     * 保存权限
     *
     * @param permission
     */
    @Override
    public void save(Permission permission) {
        permissionDao.save(permission);
    }
}
