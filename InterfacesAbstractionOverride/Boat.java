package it.develhope;

public class Boat extends Vehicle {

   public double maxSpeed;
    public  int boatWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("BRUMMMM!");
    }


    public Boat(){
        this.maxSpeed = maxSpeed;
        this.boatWeight = boatWeight;
    }

    public  String getBoatWeightAndSpeed() {
        return ("Kilos: " + boatWeight + " " + "\nSpeed: " + maxSpeed );
    }
}
