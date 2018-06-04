package Week5.Ex2;

import Week5.Ex1.CommissionEmployee;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Earl",
                "Perez",
                "123456789",
                10000,
                0.12,
                5000
        );
        System.out.printf("%nEmployee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f%nBase Salary: $%.2f%n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSocialSecurityNumber(),
                employee.getGrossSales(),
                employee.getCommissionRate(),
                employee.getBaseSalary());

        employee.setCommissionRate(0.10);
        employee.setGrossSales(20000);

        System.out.printf("%nEmployee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f%nBase Salary: $%.2f%n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSocialSecurityNumber(),
                employee.getGrossSales(),
                employee.getCommissionRate(),
                employee.getBaseSalary());

        System.out.printf("%nEmployee: %s", employee);
    }
}
