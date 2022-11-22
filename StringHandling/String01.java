public class STRING01 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2= "How are you?";

        s1 = s1.substring(0,2);
        s2 = s2.substring(10);


        char [] Array = s1.concat(s2).toCharArray();
        System.out.println(Array);
    }
}