import java.util.Arrays;

public class STRING03 {
    public static void main(String[] args) {
        String[] array1= new String[] {"I want ", "to learn ", "how to code!"};
        String[] array2 = new String[]{array1[0].trim(), array1[1].trim(), array1[2].trim()};
        System.out.println(Arrays.toString(array1) + " - " + Arrays.toString(array2));

        int statement1 = array2[0].compareTo("I want");
        int statement2 = array2[1].compareTo( "to learn");

        System.out.println("---------------------");
        boolean resultA;
        resultA = !(statement1 > statement2);
        System.out.println(resultA);

    }
}