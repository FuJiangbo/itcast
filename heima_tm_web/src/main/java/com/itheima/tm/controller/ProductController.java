package com.itheima.tm.controller;

import com.itheima.tm.domain.Product;
import com.itheima.tm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService porductService;

    @RequestMapping("/findAll")
    public String findAll(Model model) throws Exception {
        List<Product> products = porductService.findAll();
        model.addAttribute("products", products);
        return "product-list";
    }

    @RequestMapping("/save")
    public String save(Product product){
        this.porductService.save(product);
        return "redirect:/product/findAll.do";
    }

}
