package main.java.me.river750.food_delivery;

public class Delivery {
    private Order order;
    private String deliveryAddress;

    public Delivery() {
        this.order = null;
        this.deliveryAddress = null;
    }

    public void startDelivery(Customer customer, Order order) {
        this.order = order;
        this.deliveryAddress = customer.getAddress();
        System.out.println("配達が開始されました。商品 (注文ID:" + order.getId() + ") を " + customer.getAddress() + " へ配達しています。");
    }

    public void finishDelivery(Customer customer, Order order) {
        System.out.println("商品 (注文ID:" + order.getId() + ") の配達が完了しました。");
        this.order = null;
        this.deliveryAddress = null;
    }
}
