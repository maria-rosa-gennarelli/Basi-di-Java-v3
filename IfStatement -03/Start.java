package it.develhope.IF03;

public class Start {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Aldo";
        student.age = 18;

        System.out.println("The new student's name " + student.name +" age: "+ student.age);

        System.out.println("----------------------------");
        student.guessingAge();


    }
}
