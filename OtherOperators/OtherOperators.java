package it.develhope;

public class OtherOperators {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b ++;

        System.out.println(a);
        System.out.println(b);

        if (b % 2 != 0 ){
            System.out.println("The int b is an odd numbers");
            }else{
            System.out.println("The int b is a even number");
            }

        System.out.println(b*b+1);
        System.out.println(b%3);
        }

    }

