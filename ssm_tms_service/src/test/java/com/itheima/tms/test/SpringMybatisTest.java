package com.itheima.tms.test;

import com.itheima.tms.domain.Orders;
import com.itheima.tms.domain.Product;
import com.itheima.tms.domain.Traveller;
import com.itheima.tms.service.OrdersService;
import com.itheima.tms.service.ProductService;
import com.itheima.tms.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext-*.xml", "classpath*:spring-security.xml"})
public class SpringMybatisTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private UserService userService;

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

    @Test
    public void test4(){
        UserDetails userDetails = userService.loadUserByUsername("F66ADBE117EC48CC8927A7E68C0C013F");
        System.out.println(userDetails.getUsername());
    }

}
