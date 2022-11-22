import it.develhope.Smartphone;
import it.develhope.SmartphonePrice;

public class Main {
    public static void main(String ...args) {
        System.out.println("SMARTPHONE LISTS ");

        SmartphonePrice producer1 = new SmartphonePrice("Producer ", 456);
        SmartphonePrice producer2 = new SmartphonePrice("Producer2 ", 203);
        SmartphonePrice retail1 = new SmartphonePrice("Retail ", 220);
        SmartphonePrice retail2 = new SmartphonePrice("Retail2 ", 300);

        Smartphone google = new Smartphone("Google", "Pixel 6a", 4410, producer1, retail1);
        Smartphone xiaomi = new Smartphone("Xiaomi", "Note11", 2209, producer2, retail2);

        System.out.println(google);
        System.out.println(xiaomi);

        System.out.println(google.equals(xiaomi));

        try {Smartphone clonedSmartphone = google.clone();
            System.out.println(clonedSmartphone);
            System.out.println(clonedSmartphone.equals(google));

        } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
        }
    }
}