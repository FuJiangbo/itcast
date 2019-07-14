package com.itheima.tms.service.impl;

import com.itheima.tms.dao.ProductDao;
import com.itheima.tms.domain.Product;
import com.itheima.tms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    /**
     * 查询所有产品
     *
     * @return
     */
    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    /**
     * 保存产品信息
     *
     * @param product
     */
    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
