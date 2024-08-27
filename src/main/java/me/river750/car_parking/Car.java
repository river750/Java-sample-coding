package main.java.me.river750.car_parking;

public class Car {
    private String licensePlate;
    private String model;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car [ナンバー: " + licensePlate + ", 車種: " + model + "]";
    }
}
