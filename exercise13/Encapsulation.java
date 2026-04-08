class UserAccount {
    private String username;
    private String password; 
    public UserAccount(String username) {
        this.username = username;
    }
    public void setPassword(String newPassword) {
        if (isValidPassword(newPassword)) {
            this.password = newPassword;
            System.out.println("Status: Password successfully updated for " + username);
        } else {
            System.out.println("Status: Update Failed. Password must be at least 8 characters.");
        }
    }
    private boolean isValidPassword(String pass) {
        return pass != null && pass.length() >= 8;
    }
    public String getUsername() {
        return username;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("Amrita_Student");
        System.out.println("Testing account for: " + user.getUsername());
        user.setPassword("123"); 
        user.setPassword("securePassword2026");}
}