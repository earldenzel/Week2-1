package Week5.Ex1;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Earl",
                "Perez",
                "123456789",
                10000,
                0.12
        );
        System.out.printf("%nEmployee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f%n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSocialSecurityNumber(),
                employee.getGrossSales(),
                employee.getCommissionRate());

        employee.setCommissionRate(0.10);
        employee.setGrossSales(20000);

        System.out.printf("%nEmployee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f%n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSocialSecurityNumber(),
                employee.getGrossSales(),
                employee.getCommissionRate());

        System.out.printf("%nEmployee: %s", employee);
    }
}
