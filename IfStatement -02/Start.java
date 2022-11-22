package it.develhope.IF02;

public class Start {
    public static void main(String[] args) {
        String mySurname = "Gennarelli";
        String letters = "ni";

        if (mySurname.contains(letters)) {
            System.out.println("Your surname contains the sequence of letters ni");
        } else {
            System.out.println("Your surname doesn't contains the sequence of letters ni");
        }
    }
}
