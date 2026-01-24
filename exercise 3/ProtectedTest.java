public class ProtectedTest {
    protected String familySecret = "We have a map to the treasure!";

    public static void main(String[] args) {
        ProtectedTest myHome = new ProtectedTest();
        
        System.out.println("Family Secret: " + myHome.familySecret);
    }
}