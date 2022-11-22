package it.develhope.JDOC02;

/**
 * @author Maria Rosa
 */
public class Tester {
    public static void main(String[] args) {
        /**
         *I proceed to pass the parameters of the ArithmeticOperators class to the program to proceed with the execution
         */
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();

        System.out.println(arithmeticOperators.sum(1, 2));
        System.out.println(arithmeticOperators.sub(2, 4));
        System.out.println(arithmeticOperators.mul(3, 5));
        System.out.println(arithmeticOperators.div(10, 2));
    }

}
