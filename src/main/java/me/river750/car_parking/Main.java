// 駐車場管理システム

package main.java.me.river750.car_parking;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3);

        // 車を作成
        Car car1 = new Car("1234", "Toyota");
        Car car2 = new Car("5678", "Honda");
        Car car3 = new Car("9101", "Nissan");
        Car car4 = new Car("1122", "Mazda");

        // 車を駐車
        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        parkingLot.parkCar(car3);

        // 空いている駐車スペースを表示
        parkingLot.displayAvailableSpots();

        // 4台目の車を駐車（満車のため失敗するはず）
        parkingLot.parkCar(car4);

        // 使用中の駐車スペースを表示
        parkingLot.displayOccupiedSpots();

        // 1番目の駐車スペースから車を出庫
        parkingLot.removeCar(1);

        // 空いている駐車スペースを再度表示
        parkingLot.displayAvailableSpots();

        // 4台目の車を再度駐車
        parkingLot.parkCar(car4);
    }
}
