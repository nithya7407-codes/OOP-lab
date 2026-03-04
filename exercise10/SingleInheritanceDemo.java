import java.util.Scanner;

class Person {
String name;
int age;
  Person(String name, int age) {
 this.name = name;
  this.age = age;
 }
 void displayPerson() {
   System.out.println("Name: " + name);
System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String course;

  Student(String name, int age, String course) {
   super(name, age);
    this.course = course;
    }

  void displayStudent() {
      System.out.println("Course: " + course);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  System.out.print("Enter Name: ");
        String name = sc.nextLine();

  System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

 System.out.print("Enter Course: ");
        String course = sc.nextLine();

  Student s = new Student(name, age, course);
        s.displayPerson();
        s.displayStudent();
    }
}