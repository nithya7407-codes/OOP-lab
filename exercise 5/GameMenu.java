import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("--- GAME MENU ---");
            System.out.println("1. Start Game");
            System.out.println("2. Options");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            
            choice = input.nextInt(); 

        } while (choice != 3); 

        System.out.println("Exiting... Goodbye!");
    }
}