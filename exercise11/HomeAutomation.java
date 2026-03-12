import java.util.*;

class SmartDevice {
void activate() {
System.out.println("Device is powering on...");
}
}

class SmartLight extends SmartDevice {
@Override
void activate() {
System.out.println("Smart Light: Setting brightness to 100% and color to Warm White.");
}
}

class SmartAC extends SmartDevice {
@Override
void activate() {
System.out.println("Smart AC: Setting temperature to 22°C and engaging Eco-mode.");
}
}

public class HomeAutomation {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
 SmartDevice myDevice;

 System.out.println("Which device to start? (1. Light 2. AC)");
 int choice = sc.nextInt();
myDevice= new SmartDevice();
myDevice.activate();
 if (choice == 1) {
 myDevice = new SmartLight();
} else {
myDevice = new SmartAC();   
}
myDevice.activate(); 

    }
}