package it.develhope;

public class LogicOperators {
    public static void main(String[] args) {
        boolean resultA;
        resultA = 2 <= 2 && !true;
        System.out.println(resultA);

        System.out.println("--------");
        boolean resultB;
        resultB = !false && 3 > 2;
        System.out.println(resultB);

        System.out.println("--------");
        boolean resultC;
        boolean t= false;
        boolean f= true;
        resultC = !(!t || f);
        System.out.println(resultC);

        System.out.println("--------");
        boolean resultD;
        resultD = 6 > 6 ^ !(true && true);
        System.out.println(resultD);


    }

}
