import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

  Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
 this.programmingLanguage = programmingLanguage;
    }

    void showDeveloper() {
        System.out.println("Language: " + programmingLanguage);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    void showManager() {
        System.out.println("Team Size: " + teamSize);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Choose Role: 1.Developer  2.Manager");
        int choice = sc.nextInt();
        sc.nextLine();

  if (choice == 1) {
            System.out.print("Enter Programming Language: ");
            String lang = sc.nextLine();
            Developer d = new Developer(name, salary, lang);
            d.showDetails();
            d.showDeveloper();
   } else {
            System.out.print("Enter Team Size: ");
            int team = sc.nextInt();
            Manager m = new Manager(name, salary, team);
            m.showDetails();
            m.showManager();
        }
    }
}