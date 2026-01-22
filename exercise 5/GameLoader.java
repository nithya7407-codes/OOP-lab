public class GameLoader {
    public static void main(String[] args) {
        int progress = 0;

        while (progress < 100) {
            progress += 25; 
            System.out.println("Downloading... " + progress + "%");
        }

        System.out.println("Download Complete! You can play now.");
    }
}