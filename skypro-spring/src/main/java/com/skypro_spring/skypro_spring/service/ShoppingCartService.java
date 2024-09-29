package com.skypro_spring.skypro_spring.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ShoppingCartService {
    public void addPurchases(List<Integer> idList);

    public List<Integer> getCart();
}
