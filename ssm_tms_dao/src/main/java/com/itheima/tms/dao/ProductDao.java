package com.itheima.tms.dao;

import com.itheima.tms.domain.Product;

import java.util.List;

/**
 * 产品的数据访问接口
 */
public interface ProductDao {

    /**
     * 查询所有产品
     *
     * @return
     */
    public List<Product> findAll();

    /**
     * 保存产品信息
     * @param product
     */
    public void save(Product product);

    /**
     * 根据ProductdId获取产品信息
     * @param pid
     * @return
     */
    public Product findByid(String pid);
}
