package org.dz2.models;

import java.util.List;

public class Order {
    private final Long id;
    private final List<Product> products;
    private final User user;

    public Order(Long id, List<Product> products, User user) {
        this.id = id;
        this.user = user;
        this.products = products;
    }

    public List<Product> getProductList() {
        return products;
    }

    public Long getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", user=" + user +
                '}';
    }
}
