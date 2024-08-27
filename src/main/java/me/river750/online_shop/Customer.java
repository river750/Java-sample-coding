package main.java.me.river750.online_shop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int id;
    private List<Order> orders;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " が注文を確定しました。注文ID: " + order.getOrderId());
    }

    @Override
    public String toString() {
        return "Customer [顧客名: " + name + ", ID: " + id + ", 注文数: " + orders.size() + "]";
    }
}
