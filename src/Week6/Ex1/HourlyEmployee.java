package Week6.Ex1;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage <0.0){
            throw new IllegalArgumentException("Hourly rate must be >= 0.0");
        }
        if (hours <0.0 || hours>168.0){
            throw new IllegalArgumentException("Hours must be between 0 and 168 hours");
        }

        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (getHours() < 40)
            return getWage()*getHours();
        else{
            return (getWage() * 40) + (getWage() * 1.5 * (getHours()- 40));
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {

        if (wage <0.0){
            throw new IllegalArgumentException("Hourly rate must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours <0.0 || hours>168.0){
            throw new IllegalArgumentException("Hours must be between 0 and 168 hours");
        }
        this.hours = hours;
    }

    @Override
    public String toString(){
        return String.format("Hourly employee: %s%n%s: $%.2f;%s: $%.2f",
                super.toString(), "Hours worked: ", getHours(), "Hourly wage: ", getWage());
    }
}
