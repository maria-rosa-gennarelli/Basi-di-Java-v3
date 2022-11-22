package it.develhope.polimorfismo02;


public class Start {
    public static void main(String... args) {

        Animal animal = new Animal();
        Lion leo = new Lion();
        Cow cow = new Cow();


        animal.animalSound();
        leo.animalSound();
        cow.animalSound();
    }

}
