package main.java.me.river750.online_shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;
    private List<Customer> customers;

    public Shop() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + "がショップに追加されました。");
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + "が顧客リストに登録されました。");
    }

    public void processOrder(Customer customer, Order order) {
        customer.placeOrder(order);
    }

    public void displayProducts() {
        System.out.println("ショップの商品リスト:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayCustomers() {
        System.out.println("顧客リスト:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
