import java.util.Scanner;

public class CalculatorApp
{
   public static void main (String[] args) 
   {
      Scanner scanner = new Scanner (System.in);
      Calculator calculator = new Calculator();
      int a;
      int b;
      int choice;
      float result;
      showMenu();
      choice  = scanner.nextInt();
      
      while (choice  != 0)
      {
         System.out.print ("Enter the first number ");
         a = scanner.nextInt();
         System.out.print ("Enter the second number: ");
         b = scanner.nextInt();
         
         switch (choice )
         {
            case 1:
            {
               result = calculator.addition (a, b);
               System.out.println ( a + " + " + b + " = " + result);
               break;
            }
            case 2:
            {
               result = calculator.subtraction (a, b);
               System.out.println ( a + " - " + b + " = " + result);
               break;
            }
            case 3:
            {
               result = calculator.multiplication (a, b);
               System.out.println ( a + " * " + b + " = " + result);
               break;
            }
            case 4:
            {
               result = calculator.division (a, b);
               System.out.println ( a + " / " + b + " = " + result);
               break;
            }
            default:
               System.out.println ("\nInvalid option. Please try again.");
         }
         showMenu();
         choice  = scanner.nextInt();
      }
      scanner.close();
   }

   private static void showMenu()
   {
      System.out.println ("\n########################");
      System.out.println ("Calculator");
      System.out.println ("########################\n");
      System.out.println ("\nOperations:");
      System.out.println ("0. Exit");
      System.out.println ("1. Addition");
      System.out.println ("2. Subtraction");
      System.out.println ("3. Multiplication");
      System.out.println ("4. Division");
      
      System.out.print ("Choooose ");
   }
}

class Calculator
{
   public int addition (int a, int b) 
   {
      return a + b;
   }
   
   public int subtraction (int a, int b)
   {
      return a - b;
   }
   
   public int multiplication (int a, int b)
   {
      return a * b;
   }
   
   public float division (float a, float b) 
   {
      return a / b;
   }
}
