public class PublicTest {
  public String message = "Hello, everyone!";

  public static void main(String[] args) {
     PublicTest myObject = new PublicTest();
   
     for (int i = 0; i < 3; i++) {
         System.out.println(myObject.message);
        }
    }
}