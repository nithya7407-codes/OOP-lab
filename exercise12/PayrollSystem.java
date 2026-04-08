abstract class Employee {
    protected double baseSalary = 3000.0;
    abstract void calculatePay();
    public void showID() {
        System.out.println("Employee Type: " + this.getClass().getSimpleName());
    }
}

class Contractor extends Employee {
    private int hoursWorked;
    private double rate = 50.0;
    public Contractor(int hours) {
        this.hoursWorked = hours;
    }

    @Override
    void calculatePay() {
        double total = hoursWorked * rate;
        System.out.println("Contractor Total Pay: $" + total + " (Base Ref: " + baseSalary + ")");
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Contractor c = new Contractor(40);
        c.showID();
        c.calculatePay();
    }
}