package com.itheima.tms.service;

import com.itheima.tms.domain.Product;

import java.util.List;

/**
 * 产品的业务接口
 */
public interface ProductService {

    /**
     * 查询所有产品
     * @return
     */
    public List<Product> findAll();

    /**
     * 保存产品信息
     * @param product
     */
    public void save(Product product);
}
