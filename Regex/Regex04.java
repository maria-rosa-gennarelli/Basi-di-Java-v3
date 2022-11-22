import java.util.Locale;

public class REGEX04 {
    public static void main(String[] args) {
        String s1 = "x3z ? xYz ! R1 && __";
        System.out.println(s1.replaceAll("[0-9,a-z]", "*"));

    }
}
