public class Main {
    enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUN, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static void main(String[] args) {

        for (Month value : Month.values()) {
            if (value.toString().endsWith("Y")) {
                System.out.println(value + " ends with y");
            } else {
                System.out.println(value + " doesn't end with y");
            }

        }

    }

}
