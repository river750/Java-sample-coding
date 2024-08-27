package main.java.me.river750.food_delivery;

import java.util.HashSet;
import java.util.Set;

public class Menu {
    private Set<Dish> dishes;

    public Menu() {
        this.dishes = new HashSet<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Set<Dish> getDishes() {
        return dishes;
    }

    public void displayMenu() {
        System.out.println("メニュー:");
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }
}
