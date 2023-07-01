package org.dz2;

import org.dz2.models.Product;
import org.dz2.repositories.OrderRepository;
import org.dz2.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(cart());
    }

    public static String cart() {
        OrderRepository orders = new OrderRepository();
        ProductRepository products = new ProductRepository();
        List<Product> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Имеются товары: ");
            System.out.println(products.arrayProducts());
            Long id = getLong();
            int percent = getAction();

            System.out.println("Вы выбрали: ");
            Product product = products.findById(id);
            System.out.println(product);
            System.out.printf("Скидка составила %d процентов. \n" +
                    "Хотите применить скидку и добавить товар в корзину? y/n \n", percent);
            String bool;
            bool = scan.nextLine();
            if (bool.equals("n")) {
                break;
            } else {
                int newCost = product.setCost(product.getCost() - product.getCost() * percent / 100);
                cart.add(product);
                System.out.println("В вашей корзине" + cart);
            }
        }
        String bay = "Всего доброго!";
        return bay;
    }

    public static Long getLong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID товара: ");
        long num;
        num = scanner.nextLong();
        return num;
    }

    public static int getAction() {
        Random random = new Random();
        int num = random.nextInt(5);
        int percent = 0;
        if (num == 1) {
            percent = 5;
        } else if (num == 2) {
            percent = 10;
        } else if (num == 3) {
            percent = 15;
        } else if (num == 4) {
            percent = 20;
        }
        return percent;
    }
}