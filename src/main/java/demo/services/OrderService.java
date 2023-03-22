package demo.services;

import demo.model.Order;
import demo.model.Product;
import demo.repo.OrderRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {
    private Map<Integer, Order> orders = OrderRepo.getOrders();

    public OrderService() {
        Order or = new Order(1, new Product("ANOTHER HARDCODE", 78.5, 25),
                new Product("HARDCODE PRODUCT", 87.6, 13));
        orders.put(1, or);
        setCost(or);
    }

    public void addOrder(Order order) {
        order.setId(orders.size() + 1);
        orders.put(order.getId(), order);
    }

    public Order getOrderById(int id) {
        return orders.get(id);
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders.values());
    }

    public void setCost(Order order) {
        double cost = 0;
        for (Product pr : order.getProductList()) {
            cost += pr.getCost();
        }
        order.setCost(cost);
    }
}
