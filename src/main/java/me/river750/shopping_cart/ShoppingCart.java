package main.java.me.river750.shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item.getQuantity() > 0) {
            items.add(item);
            item.reduceQuantity();
            System.out.println(item.getName() + "がカートに1つ追加されました。");
        } else {
            System.out.println(item.getName() + "の在庫がありません。");
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
        item.increaseQuantity();
        System.out.println(item.getName() + "がカートから削除されました。");
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("カートの内容:");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("合計金額: " + calculateTotal() + "円");
    }
}
