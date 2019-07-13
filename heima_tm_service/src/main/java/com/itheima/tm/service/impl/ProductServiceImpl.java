package com.itheima.tm.service.impl;

import com.itheima.tm.dao.IProductDao;
import com.itheima.tm.domain.Product;
import com.itheima.tm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品的业务实现
 */
@Service()
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;


    /**
     * 查询所有的商品
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
