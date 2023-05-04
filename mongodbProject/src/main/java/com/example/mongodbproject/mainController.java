package com.example.mongodbproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mainController {
    @Autowired
    private ProductRepository productRepo;

    @GetMapping("/products")
    List<Products> getAll(){
        return productRepo.findAll();
    }

    @GetMapping("/products/title/{title}")
    List<Products> getProductsTitle(@PathVariable(value = "title")String title) {
        return productRepo.findProductsByTitle(title);
    }

    @GetMapping("/products/type/{type}")
    List<Products> getProductsType(@PathVariable(value = "type") String type) {
        return productRepo.findProductsByType(type);
    }

    @GetMapping("/products/price/{price}")
    List<Products> getProductsPrice(@PathVariable(value = "price") double price) {
        return productRepo.findProductsByPrice(price);
    }

    @GetMapping("/products/between/{lb}/{ub}")
    List<Products> findProductsByPriceBetween(@PathVariable(value = "lb") double lb,
                                              @PathVariable(value = "ub") double ub) {
        return productRepo.findProductsByPriceBetween(lb, ub);
    }


}
