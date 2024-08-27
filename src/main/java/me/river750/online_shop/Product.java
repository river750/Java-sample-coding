package main.java.me.river750.online_shop;

public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
        } else {
            System.out.println("在庫が不足しています。");
        }
    }

    @Override
    public String toString() {
        return "Product [商品名: " + name + ", 価格: " + price + "円, 在庫: " + stock + "]";
    }
}
