package it.develhope.incapsulamento01;


import java.util.Arrays;

public class Start {
    public static void main(String ...args) {
        House house = new House();
        System.out.println("THE HOUSE: ");
        house.setAddress("Viale Colombo");
        house.setFloorsNumber(4);

        house.setResidentNames(new String[]{"Mario ", " Sofia " , " Luca"});


        String resident = String.format("WE ARE" + Arrays.toString(house.getResidentNames()));

        System.out.println(house.getAddress());
        System.out.println(house.getFloorsNumber());
        System.out.println(resident);

    }
}