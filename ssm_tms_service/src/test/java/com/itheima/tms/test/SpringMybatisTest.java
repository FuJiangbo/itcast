package com.itheima.tms.test;

import com.itheima.tms.domain.Orders;
import com.itheima.tms.domain.Product;
import com.itheima.tms.domain.Traveller;
import com.itheima.tms.service.OrdersService;
import com.itheima.tms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext-*.xml")
public class SpringMybatisTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrdersService ordersService;

    @Test
    public void test(){
        List<Product> productList = productService.findAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Test
    public void test2(){
        List<Orders> ordersList = ordersService.findAll(1,4);
        for (Orders Orders : ordersList) {
            System.out.println(Orders.getProduct());
        }
    }

    @Test
    public void test3(){
        Orders orders = ordersService.findById("0E7231DC797C486290E8713CA3C6ECCC");
        /*System.out.println(orders.getMember());
        System.out.println(orders.getProduct());*/
        List<Traveller> travellers = orders.getTravellers();
        for (Traveller traveller : travellers) {
            System.out.println(traveller);
        }
    }


}
