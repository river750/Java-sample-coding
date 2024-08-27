// オンラインフードデリバリーシステム

package main.java.me.river750.food_delivery;

public class Main {
    public static void main(String[] args) {
        // レストラン作成
        Restaurant restaurant = new Restaurant("日本料理店");

        Delivery delivery = restaurant.getDelivery();

        // メニュー作成
        Dish dish1 = new Dish("寿司", 1200);
        Dish dish2 = new Dish("ラーメン", 900);
        Dish dish3 = new Dish("天ぷら", 1500);
        Dish dish4 = new Dish("カレーライス", 800);
        Dish dish5 = new Dish("うどん", 700);
        Dish dish6 = new Dish("焼き鳥", 600);

        Menu menu = restaurant.getMenu();
        menu.addDish(dish1);
        menu.addDish(dish2);
        menu.addDish(dish3);
        menu.addDish(dish4);
        menu.addDish(dish5);
        menu.addDish(dish6);

        // 顧客作成
        Customer customer1 = new Customer("田中太郎", "東京都新宿区");
        Customer customer2 = new Customer("佐藤花子", "東京都渋谷区");
        Customer customer3 = new Customer("鈴木一郎", "東京都千代田区");

        // 注文作成
        Order order1 = new Order();
        order1.addDish(dish1);
        order1.addDish(dish2);
        order1.addDish(dish6);
        order1.displayOrder();

        Order order2 = new Order();
        order2.addDish(dish3);
        order2.addDish(dish4);
        order1.displayOrder();

        // レストランが注文を受け付け
        try {
            restaurant.receiveOrder(customer1, order1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            restaurant.receiveOrder(customer2, order2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}