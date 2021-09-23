package com.sda.aplicatiePentruLicitare.controller;

import com.sda.aplicatiePentruLicitare.dto.ProductDto;
import com.sda.aplicatiePentruLicitare.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/addItem")
    public String getAddItemPage(Model model){
        // aici procesez din greu requestul, la final:
        System.out.println("heeeellloooo");
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto", productDto);
        return "addItem";
    }

    @PostMapping("/addItem")
    public String postAddItemPage(Model model, ProductDto productDto){
        System.out.println("Am primit: " + productDto);
        productService.add(productDto);
        return "addItem";
    }
}
