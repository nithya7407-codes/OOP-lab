public class ClimateControl {
    public static void main(String[] args) {
        int temperature = 32; 
        boolean isRainy = true;
        Boolean saverMode = false;

        if (temperature > 30) {
            System.out.println("Warning: High temperature detected.");
        }

        if (temperature < 15) {
            System.out.println("Mode: Heating system activated.");
        } 
        else if (temperature >= 15 && temperature <= 25) {
            System.out.println("Mode: Fan only. Weather is pleasant.");
        } 
        else {
            System.out.println("Mode: Air Conditioning activated.");
        }

        if (isRainy) {
            System.out.print("Action: Closing windows... ");
            
            if (saverMode) {
                System.out.println("Dehumidifier running in LOW power mode.");
            } else {
                System.out.println("Dehumidifier running in TURBO mode.");
            }
        } else {
            System.out.println("Action: Keeping windows open for ventilation.");
        }
    }
}