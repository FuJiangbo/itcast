package com.itheima.tms.service;

import com.itheima.tms.domain.Orders;

import java.util.List;

/**
 * 订单的业务接口
 */
public interface OrdersService {

    /**
     * 获取所有订单信息
     * @return
     */
    public List<Orders> findAll(int currentPage, int pageSize);

    /**
     * 根据订单id获取订单数据
     * @param oid
     * @return
     */
    Orders findById(String oid);
}
