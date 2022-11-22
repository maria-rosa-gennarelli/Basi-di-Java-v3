import java.util.UUID;

public class Badge {

    private static int totalNumberofEmployess;

    private String badgeIdCode;

    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberofEmployess++;
    }

    private String generateBadgeIdCode() {
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey + employee.name + employee.surname + uniqueKey;
    }

    public void showBadgeDetails() {
        System.out.print("The total number of employee tracked by the badges " + totalNumberofEmployess);
        System.out.println("The details of the employee " + employee.getEmployeeDetails());
        System.out.println("the badge ID " + generateBadgeIdCode());
    }

    public Badge (Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

}
