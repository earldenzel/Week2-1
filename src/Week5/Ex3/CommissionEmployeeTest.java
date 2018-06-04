package Week5.Ex3;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Earl",
                "Perez",
                "123456789",
                10000,
                0.12
        );

        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee(
                "Earl",
                "Perez",
                "123456789",
                10000,
                0.12,
                10000);

        System.out.printf("%s%nEarnings: %.2f%n%n", employee, employee.earnings());
        System.out.printf("%s%nEarnings: %.2f%n%n", employee2, employee2.earnings());
    }
}
