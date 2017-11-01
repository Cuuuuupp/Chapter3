
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Write a description of class Balance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balance
{    
    /**
     * Constructor for objects of class Balance
     */
    public static void main(String[] args)
    {
            double previous;
            double additionalCharges;
            double interest;
            double minimumPay;
            double newBalance;
    
            Scanner scan = new Scanner(System.in);
    
            System.out.print ("What was the previous balance:");
            previous = scan.nextDouble();
            System.out.print ("What are the additional charges:");
            additionalCharges = scan.nextDouble();
            
            newBalance = additionalCharges + previous;
            
            if (newBalance == 0) {
                interest = 0;
            } else {
                interest = 0.02;
            }
            
            newBalance = additionalCharges + previous + ((additionalCharges + previous) * interest);
            
            if (newBalance < 50) {
                minimumPay = newBalance;
            } else if (newBalance >= 50 || newBalance <= 300) {
                minimumPay = 50;
            } else {
                minimumPay = (newBalance * 0.2);
            }
            
            
            NumberFormat money = NumberFormat.getCurrencyInstance();
            System.out.println ("CS CARD International Statement");
            System.out.println ("===============================");
            System.out.println (" ");
            System.out.println ("Previous Balance:\t\t" + money.format(previous));
            System.out.println ("Additional Charges:\t\t" + money.format(additionalCharges));
            System.out.println ("Interest:\t\t\t" + interest + "%");
            System.out.println (" ");
            System.out.println ("New Balance:\t\t\t" + money.format(newBalance));
            System.out.println (" ");
            System.out.println ("Minimum Payment:\t\t\t" + money.format(minimumPay));
    
    }
}
