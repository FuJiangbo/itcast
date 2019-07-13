package com.itheima.tm.service;

import com.itheima.tm.domain.Product;

import java.util.List;

/**
 * 商品的业务接口
 */
public interface IProductService {

    /**
     * 查询所有的商品
     * @return
     * @throws Exception
     */
    public List<Product> findAll() throws Exception;

}
