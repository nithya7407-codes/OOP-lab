class Member {
    private double baseFee;
    public Member(double fee) {
        this.baseFee = fee;    }
    public void displayBill() {
        System.out.println("Standard Membership Fee: $" + baseFee);   }
    public double getBaseFee() {
        return baseFee;   }}
class PremiumMember extends Member {
    private double tax = 5.0;
    public PremiumMember(double fee) {
        super(fee);   }
    @Override
    public void displayBill() {
        super.displayBill(); 
        double total = getBaseFee() + tax;
        System.out.println("Premium Tax: $" + tax);
        System.out.println("Total Premium Bill: $" + total);
    }   }
public class FeeRegistration {
    public static void main(String[] args) {
        PremiumMember pm = new PremiumMember(100.0);
        pm.displayBill();
    }
}