package com.itheima.tms.controller;

import com.itheima.tms.domain.Product;
import com.itheima.tms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "product-list";
    }

    @RequestMapping("/save")
    public String save(Product product){
        //System.out.println(product);
        productService.save(product);
        return "redirect:/product/findAll.do";
    }
}
