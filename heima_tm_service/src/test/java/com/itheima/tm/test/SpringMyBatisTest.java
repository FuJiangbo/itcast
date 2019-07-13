package com.itheima.tm.test;

import com.itheima.tm.domain.Product;
import com.itheima.tm.service.IProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringMyBatisTest {

    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        IProductService productService = ctx.getBean(IProductService.class);
        List<Product> productList = null;
        try {
            productList = productService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
