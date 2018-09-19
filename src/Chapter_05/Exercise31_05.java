/*
 *5.31 (Financial application: compute CD value) Suppose you put $10,000 into a CD
with an annual percentage yield of 5.75%. After one month, the CD is worth
10000 + 10000 * 5.75 / 1200 = 10047.92
After two months, the CD is worth
10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
After three months, the CD is worth
10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
and so on.
Write a program that prompts the user to enter an amount (e.g., 10000), the
annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
displays a table as shown in the sample run.
 */
package Chapter_05;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise31_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter the initial deposit amount
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        
        //Prompt the user to enter the annual percentage yield
        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        
        //Prompt the user to enter the number of months
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();
        
        double CDValue = 0;  // Initialize monthly amount
        
        // Print the header
        System.out.printf("\n%-8s%-8s\n","Month", "CD Value");
        
        // Print the table body
        for(int n = 1; n <= numberOfMonths; n++)  {
            CDValue = (CDValue + amount) * (1 + annualPercentageYield / 1200);
            System.out.printf("%-8d%-8.2f\n", n, CDValue);
        }
        
    }
    
}
