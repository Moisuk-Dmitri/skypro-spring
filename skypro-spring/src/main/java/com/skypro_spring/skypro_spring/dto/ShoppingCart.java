package com.skypro_spring.skypro_spring.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static java.util.Collections.unmodifiableList;

@Component
@SessionScope
public class ShoppingCart {
    private final List<Integer> idList = new ArrayList<>();

    public List<Integer> getIdList() {
        return unmodifiableList(idList);
    }

    public void addIds(List<Integer> list) {
        idList.addAll(list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(idList, that.idList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idList);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "idList=" + idList +
                '}';
    }
}
