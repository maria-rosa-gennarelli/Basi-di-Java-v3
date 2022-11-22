import it.develhope.Boat;
import it.develhope.Car;

import java.awt.desktop.AboutEvent;
import java.sql.SQLOutput;

public class Main {
    public static void main(String ...args) {
        System.out.println("$ SUPER MACHINE DATA SHEET $");

        Car car = new Car();
        car.carPrice = 44.350;
        car.numberOfDoors = 3;
        System.out.println(car.showVehicleDetails() +"\nDoors: " + car.numberOfDoors + "\nPrice: $" + car.carPrice  );
        car.doVehicleSound();

        System.out.println("---------------------");
        System.out.println("= DREAM BOAT DATA SHEET =");
        Boat boat = new Boat();
        boat.type = "OCEANIS 40.1";
        boat.maxSpeed = 9;
        boat.boatWeight = 7985;
        System.out.println(boat.getBoatWeightAndSpeed());
        boat.doVehicleSound();

    }
}