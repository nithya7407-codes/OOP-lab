public class StaticTest {
    public static int count = 0; 

    public static void main(String[] args) {
        System.out.println("Starting count at: " + count);
        
        for (int i = 1; i <= 5; i++) {
            count++;
            System.out.println("Loop " + i + " - Global Count: " + count);
        }
    }
}