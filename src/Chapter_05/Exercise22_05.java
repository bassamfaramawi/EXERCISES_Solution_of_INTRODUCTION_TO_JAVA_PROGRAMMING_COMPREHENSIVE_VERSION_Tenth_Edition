/*
 **5.22 (Financial application: loan amortization schedule) The monthly payment 
for a given loan pays the principal and the interest. The monthly interest is 
computed by multiplying the monthly interest rate and the balance (the remaining 
principal). The principal paid for the month is therefore the monthly payment 
minus the monthly interest. Write a program that lets the user enter the loan 
amount, number of years, and interest rate and displays the amortization schedule 
for the loan.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise22_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object
        // Let the user enter loan amount
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        
        // Let the user enter loan amount
        System.err.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        
        // Let the user enter annual interest rate
        System.err.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble(),
                
                // The monthly interest rate
                monthlyInterestRate = annualInterestRate / 1200, 
                
                 // The monthly payment
                monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / 
                   Math.pow(1 + monthlyInterestRate, numberOfYears * 12)),
                
                // The total payment
                totalPayment = monthlyPayment * numberOfYears * 12; 
        
        // Display the monthly payment and the total payment
        System.out.printf("Monthly Payment: %.2f\nTotal Payment: %.2f\n", 
                monthlyPayment, totalPayment);
        
        double balance = loanAmount,
                interest,
                principal;
        
        // Print the header
        System.out.printf("%15s%15s%15s%15s\n", "Payment#", "Interest", 
                "Principal", "Balance");
        
        // Loop for printing the table body
        for (int n = 1; n <= numberOfYears * 12; n++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            
            // Display the results
            System.out.printf("%15d%15.2f%15.2f%15.2f\n", n, interest, principal, 
                    balance);
        }
    }
    
}
