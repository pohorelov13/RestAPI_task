package demo.repo;

import demo.model.Order;

import java.util.HashMap;

public class OrderRepo {
    private static HashMap<Integer, Order> orders = new HashMap<>();

    public static HashMap<Integer, Order> getOrders() {
        return orders;
    }

}
