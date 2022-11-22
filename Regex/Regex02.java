public class REGEX02 {
    public static void main(String[] args) {
        String string1 = "tup tuup tuuup tuuuup";
        System.out.println(string1.replaceAll( "u{2,3}", "X"));
    }
}
