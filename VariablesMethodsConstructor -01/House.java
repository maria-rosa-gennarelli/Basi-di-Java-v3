package it.develhope.MetodoCostruttore.MCE1;

public class House {
    public String adress;
    public int numberOfFloors;

    public House(){
        System.out.println("The House is created");
    }

    public House (String adress) {
        System.out.println("A new House wad created, is found " + adress);
        this.adress = adress;
    }

    public House (String adress, int numberOfFloors) {
        System.out.println("A new House was created, is found " + adress + " and has " + numberOfFloors + " floors");
        this.adress = adress;
        this.numberOfFloors = numberOfFloors;
    }
}
