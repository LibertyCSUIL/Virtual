/* 
Virtual Assignment Five: Casey

Objective:
Fix Casey's code, so that it outputs
"x * x is less than or equal to 100"
when x * x is less than or equal to 100
and outputs "x * x is greater than 100"
when x * x is greater than 100.
*/


import java.util.Scanner;

public class Casey
{

   public static void main(String[] args)
   {
      System.out.print("x equals ");
      Scanner input = new Scanner(System.in);
      long x = input.nextInt();
      if(x*x <= 100)
         System.out.println("x * x is less than or equal to 100");
      else
         System.out.println("x * x is greater than 100");
      
   }

}
