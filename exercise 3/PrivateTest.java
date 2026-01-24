public class PrivateTest {
  private int secretPin = 1234;

  public static void main(String[] args) {
      PrivateTest myApp = new PrivateTest();
        
      if (myApp.secretPin == 1234) {
          System.out.println("Access Granted to the Private Vault!");
        }
    }
}