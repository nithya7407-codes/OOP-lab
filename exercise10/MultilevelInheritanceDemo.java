import java.util.Scanner;

class Vehicle {
 String brand;
   Vehicle(String brand) {
        this.brand = brand;
    }
  void showBrand() {
     System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int speed;
Car(String brand, int speed) {
    super(brand);
        this.speed = speed;
    }

    void showSpeed() {
     System.out.println("Speed: " + speed + " km/h");
    }
}

class ElectricCar extends Car {
    int battery;
    ElectricCar(String brand, int speed, int battery) {
        super(brand, speed);
        this.battery = battery;
    }

    void showBattery() {
        System.out.println("Battery Capacity: " + battery + " kWh");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

     System.out.print("Enter Speed: ");
      int speed = sc.nextInt();

 System.out.print("Enter Battery Capacity: ");
       int battery = sc.nextInt();

   ElectricCar ec = new ElectricCar(brand, speed, battery);
      ec.showBrand();
  ec.showSpeed();
  ec.showBattery();
    }
}