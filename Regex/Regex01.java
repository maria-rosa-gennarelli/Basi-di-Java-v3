import java.util.Locale;

public class REGEX01 {
    public static void main(String[] args) {
        String s1 = "I Like to code near the Lake with my friend Luke";
        System.out.println(s1.replaceAll("l" ,"BLA").replaceAll("ke[^43]", "BLA"));


    }
}