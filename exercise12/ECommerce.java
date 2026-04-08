interface PaymentProcessor {
    String CURRENCY = "USD";
    void processTransaction(double amount);
}

class PayPal implements PaymentProcessor {
    @Override
    public void processTransaction(double amount) {
        System.out.println("PayPal: Charging " + amount + " " + CURRENCY + " via Email.");
    }
}

class Stripe implements PaymentProcessor {
    @Override
    public void processTransaction(double amount) {
        System.out.println("Stripe: Charging " + amount + " " + CURRENCY + " via Credit Card.");
    }
}

public class ECommerce {
    public static void main(String[] args) {
        PaymentProcessor payment = new Stripe();
        payment.processTransaction(250.00);  
        System.out.println("Global System Currency: " + PaymentProcessor.CURRENCY);
    }
}