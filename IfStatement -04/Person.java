package it.develhope.IF04;

import java.util.Random;

public class Person {
    int age;


    public Person () {
        double Random = Math.floor(Math.random() * (80 - 5 + 1) + 5);
        age = (int)Random;
    }

    public void getLifeStage(){
        String type;
        if (age <= 12){
            type = "Child";
        }else if (age <= 19){
            type = "Teen";
        }else if (age <= 59){
            type = "Adult";
        }else{
            type = "Senior Adult";
        }
        System.out.println("The person is in the "+ type +" stage of life");
    }


}

