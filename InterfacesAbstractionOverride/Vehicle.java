package it.develhope;


    public abstract class Vehicle {

        public String type;
        int numberOfWheels;


        public String showVehicleDetails() {
            return (type + "\nWheels: " + numberOfWheels);
        }

        public abstract void doVehicleSound();

}
