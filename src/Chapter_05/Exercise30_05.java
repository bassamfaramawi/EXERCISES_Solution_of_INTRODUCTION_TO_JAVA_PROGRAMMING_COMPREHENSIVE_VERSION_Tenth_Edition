/*
*5.30 (Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. So, the monthly interest
rate is 0.05 / 12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual
interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
in the savings account after the given month.
 */
package Chapter_05;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise30_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter an amount
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        
        //Prompt the user to enter the annual interest rate
        System.out.print("Enter the annual interest rate(e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        
        //Prompt the user to enter the number of months
        System.out.print("Enter the number of months: ");
        int numberOfMonths = input.nextInt();
        
        // The monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        double monthlyAmount = 0;  // Initialize monthly amount
        
        for(int n = 1; n <= numberOfMonths; n++) 
            monthlyAmount = (monthlyAmount + amount) * (1 + monthlyInterestRate);
        
        // Display the the amount in the savings account after the given month
        System.out.printf("The final amount after " + numberOfMonths + 
                " months: $%.2f" , monthlyAmount);
    }
    
}
