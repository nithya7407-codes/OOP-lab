class Operators2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Unary operators
        a++;
        b--;

        System.out.println("\nAfter Unary Operations:");
        System.out.println("a after increment = " + a);
        System.out.println("b after decrement = " + b);

        // Relational operators
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isSmaller = (a < b);

        System.out.println("\nRelational Operations:");
        System.out.println("a == b : " + isEqual);
        System.out.println("a > b  : " + isGreater);
        System.out.println("a < b  : " + isSmaller);

        // Logical operators
        boolean logicalAnd = (a > 5) && (b > 5);
        boolean logicalOr = (a > b) || (b > 20);
        boolean logicalNot = !(a == b);

        System.out.println("\nLogical Operations:");
        System.out.println("(a > 5 && b > 5): " + logicalAnd);
        System.out.println("(a > b || b > 20): " + logicalOr);
        System.out.println("!(a == b): " + logicalNot);
    }
}
