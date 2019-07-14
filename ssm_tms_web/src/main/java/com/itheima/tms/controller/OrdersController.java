package com.itheima.tms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.itheima.tms.domain.Orders;
import com.itheima.tms.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/findAll")
    public String findAll(Model model,
                          @RequestParam(name = "currentPage", required = true, defaultValue = "1") int currentPage,
                          @RequestParam(name = "pageSize", required = true, defaultValue = "4") int pageSize) {
        List<Orders> ordersList = ordersService.findAll(currentPage, pageSize);
        PageInfo<Orders> pageInfo = new PageInfo<Orders>(ordersList);
        model.addAttribute("pageInfo", pageInfo);
        return "orders-list";
    }

    @RequestMapping("/findById")
    public String findById(Model model,
                           @RequestParam(name = "oid", required = true) String oid){
        Orders orders = ordersService.findById(oid);
        model.addAttribute("orders",orders);
        return "orders-detail";
    }

}
