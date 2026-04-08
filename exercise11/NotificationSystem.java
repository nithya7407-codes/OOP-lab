class Notifier {
    public void send(String message) {
        System.out.println("General Alert: " + message);
        logInternalActivity(); 
    }
    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }
    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
    private void logInternalActivity() {
        System.out.println("[Internal Log] Private method executed via public wrapper.");
    }
}

class AppNotifier extends Notifier {
    public void displayCapabilities() {
        System.out.println("--- AppNotifier ---");
        send("System Update available.");              // Public
        send("Welcome!", "user@example.com");          // Protected
        send("Your OTP is 1234", 9876543210L);        // Default
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        AppNotifier app = new AppNotifier();
        app.displayCapabilities();
    }
}