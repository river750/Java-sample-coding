package main.java.me.river750.shopping_cart;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity() {
        quantity++;
    }

    public void reduceQuantity() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println(this.name + "は在庫が不足しています。");
        }
    }

    @Override
    public String toString() {
        return "Item [商品名: " + name + ", 価格: " + price + "円]";
    }
}