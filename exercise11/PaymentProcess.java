import java.util.*;

class Payment {
 void pay(String walletId) {
  System.out.println("Processing wallet payment for: " + walletId);
 }
void pay(long cardNum, int cvv) {
 System.out.println("Processing Card: " + cardNum + " with CVV: " + cvv);
 }
}
public class PaymentProcess{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Payment pp = new Payment();

System.out.println("Choose Payment: 1. Wallet  2. Card");
int choice = sc.nextInt();

if (choice == 1) {
System.out.print("Enter Wallet ID: ");
pp.pay(sc.next()); 
} else {
System.out.print("Enter Card Number: ");
long card = sc.nextLong();
System.out.print("Enter CVV: ");
int cvv = sc.nextInt();
pp.pay(card, cvv); 
}
}
}