package it.develhope.ClassieOggetti.COE1;

public class Programmer {
        public String name;

        public int age;
        public boolean wearsGlasses;

        public void drinkCoffe(){
        System.out.println("Espresso is the secret!");
        }

        public void printDetails(){
            System.out.println( name + "  " + age );
        }

        public void hasGlasses() {
            System.out.println("Is wearing glasses? " + wearsGlasses);
        }

}

