/*
 * *2.20 (Financial application: calculate interest) If you know the balance and 
    the annual percentage interest rate, you can compute the interest on the next 
    monthly payment using the following formula:
        interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate 
and displays the interest for the next month.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 
 */
public class Exercise20_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        
        // Calculate the values
        double balance = input.nextDouble(),
                interestRate = input.nextDouble() / 1200,
                interest = balance * interestRate;
        
        // Print the result
        System.out.print("The interest is " + (int)(interest * 10000) / 10000.0);
    }
    
}
