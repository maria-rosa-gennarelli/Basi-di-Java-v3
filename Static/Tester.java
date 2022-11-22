public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee("Maria Rosa", "Gennarelli", "Via Carlo");
        Employee employee1 = new Employee("Aldo", "Rossi", "Via Gerri");

        Badge badge = new Badge(employee);
        Badge badge1 = new Badge(employee1);

        badge.showBadgeDetails();
        badge1.showBadgeDetails();
    }
}
