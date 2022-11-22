import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DATE02 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter t1= DateTimeFormatter.ofPattern("dd - MMMM - yy HH:mm");
        System.out.println(time.format(t1));
        System.out.println(ZonedDateTime.now());

    }
}
