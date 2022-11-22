package it.develhope;

public class Car extends Vehicle{
    public int numberOfDoors;
    public double carPrice;



    @Override
    public void doVehicleSound() {
        System.out.println("VROOOOOOM!");
    }


    @Override
    public String showVehicleDetails() {
        return super.showVehicleDetails();
    }

    public Car() {
        this.type = "BMW Z4";
        this.numberOfWheels = 4;
        this.carPrice = carPrice;
        this.numberOfDoors = numberOfDoors;
    }
}
