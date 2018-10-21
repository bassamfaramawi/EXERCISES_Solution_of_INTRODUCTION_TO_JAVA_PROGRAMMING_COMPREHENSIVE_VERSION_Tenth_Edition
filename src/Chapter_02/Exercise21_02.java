/*
 * *2.21 (Financial application: calculate future investment value) Write a 
    program that reads in investment amount, annual interest rate, and number of 
    years, and displays the future investment value using the following formula:
       futureInvestmentValue = 
       investmentAmount * (1 + monthlyInterestRate) ^ numberOfYears * 12
    For example, if you enter amount 1000, annual interest rate 3.25%, and number
    of years 1, the future investment value is 1032.98.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise21_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble() / 1200;
        System.out.print("Enter number of years: ");
        
        // Calculate the values
        double numberOfYears = input.nextDouble(),
                futureInvestmentValue = investmentAmount * Math.pow(1 + 
                        monthlyInterestRate, numberOfYears*12);
        
        // Print the result
        System.out.print("Accumulated value is $" + (int)(futureInvestmentValue 
                * 100) / 100.0);
        
    }
    
}
