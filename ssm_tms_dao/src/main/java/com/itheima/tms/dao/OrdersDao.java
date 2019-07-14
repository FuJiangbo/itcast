package com.itheima.tms.dao;

import com.itheima.tms.domain.Orders;

import java.util.List;

/**
 * 订单的中间表
 */
public interface OrdersDao {

    /**
     * 查询所有订单
     * @return
     */
    public List<Orders> findAll();

    /**
     * 根据订单id获取订单数据
     * @param oid
     * @return
     */
    public Orders findById(String oid);
}
