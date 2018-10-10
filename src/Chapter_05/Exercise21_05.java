/*
 **5.21 (Financial application: compare loans with various interest rates) Write 
a program that lets the user enter the loan amount and loan period in number of 
years and displays the monthly and total payments for each interest rate starting 
from 5% to 8%, with an increment of 1/8.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise21_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object
        // Let the user enter loan amount
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        
        // Let the user enter loan amount
        System.err.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        
        double interestRate = 5,  // Initialize interest rate from 5%
                annualInterestRate, // The annual interest rate
                monthlyInterestRate, // The monthly interest rate
                monthlyPayment, // The monthly payment
                totalPayment,  // The total payment
                increment = 0.125; // The increment
        
        int count = (int)((8 - 5) / 0.125);  // The loop count number
        
        // Print the header
        System.out.printf("%17s%17s%17s\n" ,"Interest Rate", "Monthly Payment", 
                "Total Payment");
        
        for(int n = 0; n <= count; n++) {  // Loop for printing the table body
           annualInterestRate = interestRate + n * increment;
           monthlyInterestRate = annualInterestRate / 1200;
           monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / 
                   Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
           totalPayment = monthlyPayment * numberOfYears * 12;
           
           // Display the result
           System.out.printf("%17.3f%17.2f%17.2f\n", annualInterestRate, 
                   monthlyPayment, totalPayment);
        }
        
    }
    
}
