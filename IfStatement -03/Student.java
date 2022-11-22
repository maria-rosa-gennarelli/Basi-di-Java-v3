package it.develhope.IF03;
import java.util.Random;

public class Student {

    String name;
    int age;

    public Student (){
        this.name = name;
        this.age = age;
    }


    public void guessingAge(){
        int randomAge;
        Random random = new Random();
        randomAge = random.nextInt(35);
        System.out.println("I generated the random number " + randomAge+ " for student " + name);
        if(randomAge == age) {
            System.out.println("The number is equal");
        }else if (randomAge > age) {
            System.out.println("The number is greater");
        }else{
            System.out.println("The number is lower");
        }

    }




}
