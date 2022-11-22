package it.develhope;

public class Boolean4 {
    public static void main(String[] args) {

        boolean resultA;
        int a = 1;
        int b = 3;
        int c = a*b;
        int d = c;
        resultA= (d / c + 2) >= b || !(c + b - c / a == 3);
        System.out.println(resultA);

        System.out.println("--------");
        boolean resultB;
        int x = 5;
        int y = 6;
        boolean t=false;
        boolean f = true;
        resultB = (x * x - y * y / 2 != 12) || !t && f;
        System.out.println(resultB);

    }

}
