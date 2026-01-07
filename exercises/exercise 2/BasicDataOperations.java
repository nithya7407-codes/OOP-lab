class BasicDataOperations {
    public static void main(String[] args) {

        int a = 15;
        int b = 5;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        float x = 4.5f;
        double y = 2.0;

        double result = x * y;

        boolean valid = true;
        char op = '*';

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        System.out.println("Float " + op + " Double: " + result);
        System.out.println("Valid Operation: " + valid);
    }
}
