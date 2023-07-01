package org.dz2.services;


import org.dz2.models.Order;
import org.dz2.models.Product;
import org.dz2.models.User;
import org.dz2.repositories.ProductRepository;
import org.dz2.repositories.UserRepository;

import java.util.List;

public class OrderService {
    private List<Product> productList;
    private ProductRepository productRepository;
    private UserRepository user;

    public OrderService(List<Product> productList, ProductRepository productRepository, UserRepository user) {
        this.productList = productList;
        this.productRepository = productRepository;
        this.user = user;
    }


}
