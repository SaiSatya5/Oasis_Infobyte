package JavaFX.Task_2;
import java.util.*;
public class Guessthenumber {
    public static void guessIt()
    {
        Scanner key = new Scanner(System.in);
        int z = 1 + (int)(100 * Math.random());
 
        int x = 3;
 
        int i, g;
 
        System.out.println("A RANDOM NUMBER HAS BEEN GENERATED " + "IN BETWEEN THE RANGE OF 1 TO 100.");
        System.out.println("GUESS THE NUMBER.");
        System.out.println("YOU HAVE 3 CHANCES.");

        for (i = 0; i < x; i++) 
            {
 
              System.out.println("GUESS THE NUMBER : ");
 
              g = key.nextInt();
 
              if (z == g) 
                 {
                  System.out.println(" CONGRATS ! " + " YOUR GUESS WAS CORRECT.");
                  break;
                 }
            
               else if (z > g && i != x - 1) 
                       {
                         System.out.println(" THE NUMBER IS "+ " GREATER THAN " + g);
                       }
                  
                  else if (z < g && i != x - 1) 
                          {
                            System.out.println(" THE NUMBER IS "+ " LESS THAN " + g);
                          }
             }
 
                   if (i == x) 
                      {
                        System.out.println(" YOU ARE OUT OF CHANCES.");
 
                        System.out.println(" THE GENERATED NUMBER WAS : " + z);
                      }
      }
    public static void main(String args[])
    {
        guessIt();
    }
}
