package org.dz2.repositories;

import org.dz2.models.Product;
import org.dz2.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
    }

    public List<Product> arrayProducts() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1L,"Bread", 50),
                new Product(2L, "Milk", 90),
                new Product(3L, "Cheese", 250),
                new Product(4L,"Beer", 90),
                new Product(5L, "Vodka", 350)
        ));
        return products;
    }

    public Product findById(Long id) {
        for (Product product : arrayProducts()) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new RuntimeException("Product not found");
    }
}
