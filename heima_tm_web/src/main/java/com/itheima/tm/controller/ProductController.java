package com.itheima.tm.controller;

import com.itheima.tm.domain.Product;
import com.itheima.tm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService porductService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Product> findAll(){
        try {
            return porductService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
