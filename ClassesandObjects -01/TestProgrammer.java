package it.develhope.ClassieOggetti.COE1;

    public class TestProgrammer {

        public static void main(String[] args) {

            Programmer programmer, programmer2;
            programmer = new Programmer();
            programmer2 = new Programmer();

            programmer.name = "Filippo";
            programmer.age = 30;
            programmer.wearsGlasses = false;
            programmer.drinkCoffe();
            programmer.printDetails();

            programmer2.name = "Giulia";
            programmer2.age = 26;
            programmer2.wearsGlasses = true;
            programmer2.printDetails();
            programmer2.hasGlasses();

        }

    }

