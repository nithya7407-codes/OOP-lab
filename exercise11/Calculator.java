public class Calculator
{    public int add(int a, int b)
          {       return a+b;   }
     protected int add(int a, int b, int c)
          {    return a+b+c;     }
     private double add(double a, double b)
          {     return a+b;    }
    public void displayResult(double a, double b) {
        double result = add(a, b);
        System.out.println("the sum in private method is " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(9, 6));
        System.out.println(calc.add(5, 7, 3));
        calc.displayResult(4.5, 9.7);
    }
}
