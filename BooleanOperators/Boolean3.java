package it.develhope;

public class Boolean3 {
    public static void main(String[] args) {
        boolean resultA;
        resultA = !(!(!(false ^ false) || (true && true)));
        System.out.println(resultA);

        System.out.println("--------");
        boolean resultB;
        int x = 3;
        int y = 2;
        resultB =  !((x * y) <= 6) && (x - y != 1);
        System.out.println(resultB);

    }
}
