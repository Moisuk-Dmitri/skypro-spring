package com.skypro_spring.skypro_spring.service;

import com.skypro_spring.skypro_spring.dto.ShoppingCart;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addPurchases(List<Integer> idList) {
        shoppingCart.addIds(idList);
    }

    @Override
    public List<Integer> getCart() {
        return shoppingCart.getIdList();
    }
}
