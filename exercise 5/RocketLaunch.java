public class RocketLaunch {
    public static void main(String[] args) {
        
        System.out.println("Starting Countdown...");

        for (int i = 10; i >= 1; i--) {
            System.out.println("T-minus " + i + " seconds...");
            
            if (i == 5) {
                System.out.println("--- Engine Ignition Sequence Start ---");
            }
        }

        System.out.println("LiftOFF");
    }
}