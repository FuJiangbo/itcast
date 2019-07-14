package com.itheima.tm.dao;

import com.itheima.tm.domain.Product;

import java.util.List;

/**
 * 商品的数据访问接口
 */
public interface IProductDao {

    /**
     * 查询所有的商品
     * @return
     * @throws Exception
     */
    public List<Product> findAll() throws Exception;

    /**
     * 保存产品
     * @param product
     */
    void save(Product product);
}
