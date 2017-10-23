// ***************************************************************
//   ChargeAccount.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;  // employee's current  salary
           double charges = 0;              // amount of the raise
           double newBalance;          // new salary for the employee
           double minimumPayment;             // performance rating
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the ammount of charges to your account: ");
           charges = scan.nextDouble();
          
           // Compute the raise using if ...
           
           newBalance = previousBalance + charges;
           newBalance = newBalance + (0.02 * newBalance);
           
           if(newBalance < 50) {
               minimumPayment = newBalance;
           } else if(newBalance >= 50 && newBalance <= 300){
               minimumPayment = 50.00;
           } else{
               minimumPayment = .2 * newBalance;
            }
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println("CS CARD International statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previous Balance:            " + money.format(previousBalance));
           System.out.println("Additional Charges:          " + money.format(charges));
           System.out.println("Interest:                    2% ");
           System.out.println();
           System.out.println("New Balance:                 " + money.format(newBalance));
           System.out.println();
           System.out.println("Minimum Payment:             " + money.format(minimumPayment));
        }
}