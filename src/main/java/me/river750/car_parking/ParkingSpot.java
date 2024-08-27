package main.java.me.river750.car_parking;

public class ParkingSpot {
    private int spotId;
    private boolean occupied;
    private Car parkedCar;

    public ParkingSpot(int spotId) {
        this.spotId = spotId;
        this.occupied = false;
        this.parkedCar = null;
    }

    public int getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void parkCar(Car car) {
        if (!occupied) {
            this.parkedCar = car;
            this.occupied = true;
            System.out.println(car + " を駐車スペース" + spotId + "番に駐車しました。");
        } else {
            System.out.println("駐車スペース" + spotId + "番はすでに使用中です。");
        }
    }

    public void removeCar() {
        if (occupied) {
            System.out.println(parkedCar + " を駐車スペース" + spotId + "番から出庫しました。");
            this.parkedCar = null;
            this.occupied = false;
        } else {
            System.out.println("駐車スペース" + spotId + "番はすでに空いています。");
        }
    }

    @Override
    public String toString() {
        return "ParkingSpot [ID: " + spotId + ", 使用状況: " + (occupied ? "使用中" : "空き") + "]";
    }
}
