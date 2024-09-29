package com.skypro_spring.skypro_spring.controller;

import com.skypro_spring.skypro_spring.service.ShoppingCartService;
import com.skypro_spring.skypro_spring.service.ShoppingCartServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {
    private final ShoppingCartServiceImpl shoppingCartService;

    public ShoppingCartController(ShoppingCartServiceImpl shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "/add")
    public void addPurchases(@RequestParam("id") List<Integer> idList) {
        shoppingCartService.addPurchases(idList);
    }

    @GetMapping(path = "/get")
    public List<Integer> getCart() {
        return shoppingCartService.getCart();
    }
}
