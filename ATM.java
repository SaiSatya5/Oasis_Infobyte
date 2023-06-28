package JavaFX.Task_3;
import java.util.*;  
public class ATM
{  
     public static void main(String args[] )  
     {  
          int balance = 0;
          int withdraw;
          int deposit;  
          Scanner sc = new Scanner(System.in);  
          while(true)  
          {  
               System.out.println("*****ATM*****\n");  
               System.out.println("1.WITHDRAW\n");  
               System.out.println("2.DEPOSIT\n");  
               System.out.println("3.CHECK BALANCE\n");  
               System.out.println("4.EXIT\n");  
               System.out.print("ENTER YOUR CHOICE : ");  
               int choice = sc.nextInt();  
               switch(choice)  
               {  
                    case 1:  
                         System.out.print("ENTER THE AMOUNT TO WITHDRAW :");      
                         withdraw = sc.nextInt();           
                         if(balance >= withdraw)  
                         {  
                              balance = balance - withdraw;    
                              System.out.println("COLLECT YOUR AMOUNT.\n");  
                         }  
                         else  
                         {  
                              System.out.println("INSUFFICINT BALANCE\n");  
                         }  
                         System.out.println("");  
                         break;  
                    case 2:  
                         System.out.print("ENTER AMOUNT TO DEPOSIT:");  
                         deposit = sc.nextInt();  
                         balance = balance + deposit;  
                         System.out.println("AMOUNT HAS BEEN DEPOSITED SUCCESSFULLY.\n");  
                         System.out.println("");  
                         break;  
                    case 3:  
                         System.out.println("BALANCE : "+balance);  
                         System.out.println("");  
                         break;  
                    case 4:  
                         System.out.println("TERMINATED SUCCESSFULLY.");
                         System.exit(0);  
               }  
          } 
     }  
}