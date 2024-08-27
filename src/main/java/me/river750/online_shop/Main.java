// オンラインショップの管理システム

package main.java.me.river750.online_shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // 商品を追加
        Product product1 = new Product("ノートパソコン", 100000, 10);
        Product product2 = new Product("スマートフォン", 70000, 20);
        shop.addProduct(product1);
        shop.addProduct(product2);

        // 顧客を追加
        Customer customer1 = new Customer("山田 太郎", 1);
        Customer customer2 = new Customer("佐藤 花子", 2);
        shop.registerCustomer(customer1);
        shop.registerCustomer(customer2);

        // 注文を作成
        Order order1 = new Order();
        order1.addProduct(product1, 1);
        order1.addProduct(product2, 2);

        Order order2 = new Order();
        order2.addProduct(product2, 1);

        // 顧客が注文を確定
        shop.processOrder(customer1, order1);
        shop.processOrder(customer2, order2);

        // ショップの情報を表示
        shop.displayProducts();
        shop.displayCustomers();
    }
}