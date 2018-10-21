/*
 *6.7 (Financial application: compute the future investment value) Write a method 
that computes future investment value at a given interest rate for a specified 
number of years. The future investment is determined using the formula in 
Programming Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate, int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns
12833.59.
Write a test program that prompts the user to enter the investment amount (e.g.,
1000) and the interest rate (e.g., 9%) and prints a table that displays future 
value for the years from 1 to 30
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise07_06 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble() / 1200;
        
        System.out.printf("%-12sFuture Value\n", "Years");
        
        for(int years = 1; years <= 30; years++)
            System.out.printf("%-12d%.2f\n", years, 
                    futureInvestmentValue(investmentAmount, monthlyInterestRate, 
                            years));
    }
    
    public static double futureInvestmentValue(double investmentAmount, 
            double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
    }
}
