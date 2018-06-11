package Week6.Ex1;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salaryMan = new SalariedEmployee(
                "John", "Smith", "123456789", 45);
        HourlyEmployee hourMan = new HourlyEmployee(
                "Tina", "Jones", "222222222", 70,55);
        CommissionEmployee commissionMan = new CommissionEmployee(
                "Wallace", "Balaniuc", "333333333", 50000, .25);
        BasePlusCommissionEmployee basePlusMan = new BasePlusCommissionEmployee(
                "Bob", "Bobbery", "444444444", 25000,0.1,5000);

        //System.out.println("Employees processed individually");
        //System.out.printf("%n%s%n%s: $%.2f%n%n", salaryMan, "Earned", salaryMan.earnings());
        //System.out.printf("%n%s%n%s: $%.2f%n%n", hourMan, "Earned", hourMan.earnings());
        //System.out.printf("%n%s%n%s: $%.2f%n%n", commissionMan, "Earned", commissionMan.earnings());
        //System.out.printf("%n%s%n%s: $%.2f%n%n", basePlusMan, "Earned",  basePlusMan.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salaryMan;
        employees[1] = hourMan;
        employees[2] = commissionMan;
        employees[3] = basePlusMan;

        System.out.println("Employees processed polymorphically");
        for(Employee employee: employees){
            System.out.printf("%n%s%n%s: $%.2f%n%n", employee, "Earned", employee.earnings());
        }


    }
}
