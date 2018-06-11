package Week6.Ex1;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        //validate base salary
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s %s%n%s: %.2f",
                "Base Plus",
                super.toString(),
                "Base Salary",
                baseSalary);
    }

    public double earnings(){
        return super.earnings() + baseSalary;
    }
}
