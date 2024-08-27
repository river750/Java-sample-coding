package main.java.me.river750.food_delivery;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int idCounter = 100;
    private int id;
    private List<Dish> dishes;

    public Order() {
        this.id = idCounter++;
        this.dishes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Dish dish : dishes) {
            total += dish.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("注文ID: " + id);
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
        System.out.println("合計金額: " + calculateTotalPrice() + "円");
    }
}
