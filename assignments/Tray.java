/*
Programmer: 

Virtual Program Assignment Seven: Tray

Objective:
Fix Tray's code so that it writes
a random long to the file "random.txt"
and prints "Error!" if there is an exception.
*/

import Java.io.*;
import Java.util.Random;

public class Tray
{

   public static void main(String[] args)
   {
      Random rand = new Random(); // this line is correct
      long rand_int = rand.nextInt(); // this line is correct

      FileWriter file = new FileWriter(random.txt);
      PrintWriter write = new PrintWriter(file);
      file.print(rand_int);
      file.close();

      System.out.println("Error!");
   }

}
