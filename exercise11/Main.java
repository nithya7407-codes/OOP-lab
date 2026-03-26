import java.util.*;
class Calculator
{    public int add(int a,int b)
     {   return a+b;      }
     protected void display()
     {     System.out.println("An Message for the user");
      }
     private void show()
      {      System.out.println("private message");
      }
     public void accessPrivate()
     {       show();
      }
}
class AdvancedCalculator extends Calculator 
{   @Override
    public int add(int a, int b)
 {            return (a + b + 1);        }
     @Override
     protected void display()
     {     System.out.println("An Message for the Advanced user");
      }
      public void show()
      {      System.out.println("public message");
      }
   }
public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int m = sc.nextInt();
        System.out.print("Enter second integer: ");
        int n = sc.nextInt();

        Calculator baseCal = new Calculator();
        System.out.println("Base Sum: " + baseCal.add(m, n));
        baseCal.display();

        AdvancedCalculator advCal = new AdvancedCalculator();
        System.out.println("Advanced Sum: " + advCal.add(m, n));
        advCal.display();
        advCal.show(); 

        Calculator aCal = new AdvancedCalculator();
       
        System.out.println("Polymorphic Sum: " + aCal.add(m, n));
        
        aCal.display();
        aCal.accessPrivate();

      
    }
}
    