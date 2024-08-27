package main.java.me.river750.food_delivery;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private Order order;
    private List<Order> orderHistory;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.order = null;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Order getOrder() {
        return order;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void placeOrder(Order order) {
        this.order = order;
        orderHistory.add(order);
        System.out.println(name + " の注文が確定しました。(注文ID:" + order.getId() + ")");
    }

    @Override
    public String toString() {
        return "お客様: " + name + " (住所: " + address + ")";
    }
}
