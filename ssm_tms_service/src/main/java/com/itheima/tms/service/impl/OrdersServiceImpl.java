package com.itheima.tms.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.tms.dao.OrdersDao;
import com.itheima.tms.dao.ProductDao;
import com.itheima.tms.domain.Orders;
import com.itheima.tms.domain.Product;
import com.itheima.tms.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单的业务实现
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private ProductDao productDao;

    /**
     * 获取所有订单信息
     *
     * @return
     */
    @Override
    public List<Orders> findAll(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return ordersDao.findAll();
    }

    /**
     * 根据订单id获取订单数据
     *
     * @param oid
     * @return
     */
    @Override
    public Orders findById(String oid) {
        return ordersDao.findById(oid);
    }
}
