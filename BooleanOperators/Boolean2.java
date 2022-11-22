package it.develhope;

public class Boolean2 {
    public static void main(String[] args) {
        boolean resultA;
        resultA = (55 != 55) && (false ^ true);
        System.out.println(resultA);

        System.out.println("--------");
        boolean resultB;
        boolean a=true;
        boolean  b=false;
        int c=2;
        char d='2';
        resultB = (!a || !b) || c == d;
        System.out.println(resultB);

        System.out.println("--------");
        boolean resultC;
        resultC =  false && true || false && !false;
        System.out.println(resultC);

        System.out.println("--------");
        boolean resultD;
        resultD =  (false && true) || (false || true);
        System.out.println(resultD);

    }
}
