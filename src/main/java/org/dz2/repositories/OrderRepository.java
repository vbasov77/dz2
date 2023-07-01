package org.dz2.repositories;

import org.dz2.models.Order;
import org.dz2.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderRepository {
    protected ProductRepository productRepository;
    private List<Order> orderList;

    private UserRepository user;

    public OrderRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public OrderRepository() {
    }

    public List<Order> arrayOrders() {

        ProductRepository productRepository = new ProductRepository();
        UserRepository user = new UserRepository();

        List<Product> cart1 = new ArrayList<>();

        cart1.add(productRepository.findById(1L));
        cart1.add(productRepository.findById(2L));
        cart1.add(productRepository.findById(3L));

        List<Product> cart2 = new ArrayList<>();
        cart2.add(productRepository.findById(3L));
        cart2.add(productRepository.findById(4L));
        cart2.add(productRepository.findById(5L));


        orderList = new ArrayList<>(Arrays.asList(
                new Order(1L, cart1, user.findById(1L)),
                new Order(2L, cart2, user.findById(2L))
        ));
        return orderList;
    }

    public Order findById(Long id) {
        for (Order order : arrayOrders()) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        throw new RuntimeException("User not found");
    }


}
