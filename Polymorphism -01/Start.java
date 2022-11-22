package it.develhope.polimorfismo01;

import it.develhope.polimorfismo01.Animal;

public class Start {
    public static void main(String ...args) {

        Animal animal = new Animal("Lion");

        animal.animalSound();
        animal.animalSound("high");
    }
}
