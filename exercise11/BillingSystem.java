class InvoiceProcessor {
    public void processInvoice(double amount) {
        double tax = calculateTax(amount); 
        System.out.println("Base Invoice: Total $" + (amount + tax));
    }
    private double calculateTax(double amount) {
        return amount * 0.10; 
    }
}

class RetailInvoice extends InvoiceProcessor {
    @Override
    public void processInvoice(double amount) {
        double discount = amount * 0.15; 
        double finalPrice = amount - discount;
        System.out.println("Retail Invoice (Discount Applied): $" + finalPrice);
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        InvoiceProcessor processor = new RetailInvoice();
        System.out.println("--- Billing System Execution ---");
        processor.processInvoice(100.0);
        InvoiceProcessor baseProcessor = new InvoiceProcessor();
        baseProcessor.processInvoice(100.0);
    }
}