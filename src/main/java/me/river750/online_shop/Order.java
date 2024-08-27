package main.java.me.river750.online_shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int idCounter = 100;
    private int orderId;
    private List<Product> products;
    private int totalAmount;

    public Order() {
        this.orderId = idCounter++;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void addProduct(Product product, int quantity) {
        if (product.isAvailable() && quantity <= product.getStock()) {
            for (int i = 0; i < quantity; i++) {
                products.add(product);
            }
            totalAmount += product.getPrice() * quantity;
            product.reduceStock(quantity);
            System.out.println(product.getName() + "が" + quantity + "個、注文(ID:" + orderId + ")に追加されました。");
        } else {
            System.out.println(product.getName() + "の在庫が不足しています。");
        }
    }

    @Override
    public String toString() {
        return "Order [注文ID: " + orderId + ", 合計金額: " + totalAmount + "円, 商品数: " + products.size() + "]";
    }
}
