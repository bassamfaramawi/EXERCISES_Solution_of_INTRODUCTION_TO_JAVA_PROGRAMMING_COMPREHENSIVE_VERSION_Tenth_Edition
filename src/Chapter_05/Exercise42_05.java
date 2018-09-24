/*
 *5.42 (Financial application: find the sales amount) Rewrite Programming Exercise
5.39 as follows:
■ Use a for loop instead of a do-while loop.
■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */
package Chapter_05;

import java.util.Scanner;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise42_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter the commission Commission sought
        System.out.print("Enter the Commission sought in a year: ");
        
        double COMMISSION_SOUGHT_IN_YEAR = input.nextInt();  // Receive integer
        
        // Get the monthly commission target
        double COMMISSION_SOUGHT_PER_MONTH = COMMISSION_SOUGHT_IN_YEAR / 12; 
        
        double salesAmount = 0.01,  // Initialize the sales amount
                commission = 0;  // Initialize the commision needed
        
        for(salesAmount = 0.01; commission < COMMISSION_SOUGHT_PER_MONTH; 
                salesAmount += 0.01) {
            if(salesAmount > 10000.01)
                commission = (salesAmount - 10000) * 0.12 + 5000 * 0.10 + 
                        5000 * 0.08;
            else if(salesAmount > 5000.01)
                commission = (salesAmount - 5000) * 0.10 + 5000 * 0.08;
            else 
                commission = salesAmount * 0.08;
        }
        
        // Display the result
        System.out.printf("You need $%.2f monthly sales amount to make a "
                + "commission of $30000 per year", salesAmount);
    }
    
}
