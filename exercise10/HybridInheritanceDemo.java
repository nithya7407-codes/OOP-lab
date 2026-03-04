import java.util.Scanner;

interface Bonus {
    void calculateBonus();
}

class Person {
    String name;
  Person(String name) {
        this.name = name;
    }
void showName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person implements Bonus {
    double salary;
  Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println("Bonus: " + bonus);
    }
 void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(name, salary);
        e.showName();
        e.showSalary();
        e.calculateBonus();
    }
}