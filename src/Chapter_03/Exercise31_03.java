/*
 *3.31 (Financials: currency exchange) Write a program that prompts the user to 
enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the 7
user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 */
package Chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise31_03 {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Asking to enter exchange rate from dollar to RMB
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        
        // Asking to enter 0 to convert dollars to RMB and 1 vice versa
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int  convert = input.nextInt();
        
        // Initialize dollars double and RMB double
        double dollars, RMB;
        
        switch(convert) { 
            // If 0 convert from dollars to RMB
            case 0 : // Asking to enter the dollar amount
                     System.out.print("Enter the dollar amount: "); 
                     dollars = input.nextDouble();
                     // Calculate RMB and display the result
                     RMB = dollars * exchangeRate;
                     System.out.print("$" + dollars + " is " + 
                             (int)(RMB * 100) / 100.0 + " yuan");
                     break;
                     
            // If 0 convert from dollars to RMB
            case 1 : // Asking to enter the RMB amount
                     System.out.print("Enter the RMB amount: "); 
                     RMB = input.nextDouble();
                     // Calculate dollars and display the result
                     dollars = RMB / exchangeRate;
                     System.out.print(RMB + "yuan is $" + 
                             (int)(dollars * 100) / 100.0);
                     break;
                     
            // Otherwise is an Incorrect input
            default : System.out.print("Incorrect input");      
        }
    }
    
}
