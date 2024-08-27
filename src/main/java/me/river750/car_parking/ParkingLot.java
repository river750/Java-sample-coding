package main.java.me.river750.car_parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(int numSpots) {
        parkingSpots = new ArrayList<>();
        for (int i = 1; i <= numSpots; i++) {
            parkingSpots.add(new ParkingSpot(i));
        }
    }

    public void parkCar(Car car) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied()) {
                spot.parkCar(car);
                return;
            }
        }
        System.out.println("すべての駐車スペースが満車です。");
    }

    public void removeCar(int spotId) {
        if (spotId > 0 && spotId <= parkingSpots.size()) {
            ParkingSpot spot = parkingSpots.get(spotId - 1);
            spot.removeCar();
        } else {
            throw new IllegalStateException("無効な駐車スペースIDです。");
        }
    }

    public void displayAvailableSpots() {
        System.out.println("空いている駐車スペース:");
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied()) {
                System.out.println("駐車スペースID: " + spot.getSpotId());
            }
        }
    }

    public void displayOccupiedSpots() {
        System.out.println("使用中の駐車スペース:");
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isOccupied()) {
                System.out.println("駐車スペースID: " + spot.getSpotId() + ", 駐車中の車: " + spot.getParkedCar());
            }
        }
    }
}
