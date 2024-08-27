package main.java.me.river750.food_delivery;

public class Restaurant {
    private String name;
    private Menu menu;
    private Delivery delivery;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new Menu();
        this.delivery = new Delivery();
    }

    public String getName() {
        return name;
    }

    public Menu getMenu() {
        return menu;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void receiveOrder(Customer customer, Order order) throws InterruptedException {
        customer.placeOrder(order);
        System.out.println("調理中…");
        Thread.sleep(10000);
        System.out.println("配送手配中…");
        Thread.sleep(10000);
        delivery.startDelivery(customer, order);
        Thread.sleep(10000);
        delivery.finishDelivery(customer, order);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
