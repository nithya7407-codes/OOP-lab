public class FruitScanner {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
  
            if (i == 4) {
                System.out.println("Fruit" + i + " is rotten. SKIPPING...");
                continue; 
            }

            if (i == 8) {
                System.out.println("Fruit" + i + " is dangerous! STOPPING MACHINE...");
                break; 
            }

            System.out.println("Fruit" + i + " scanned successfully.");
        }
        
        System.out.println("Machine is now off.");
    }
}