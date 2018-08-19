/*
 * **2.13 (Financial application: compound value) Suppose you save $100 each 
       month into a savings account with the annual interest rate 5%. Thus, the 
       monthly interest rate is 0.05/12 = 0.00417. After the first month, the 
       value in the account becomes
           100 * (1 + 0.00417) = 100.417
       After the second month, the value in the account becomes
           (100 + 100.417) * (1 + 0.00417) = 201.252
       After the third month, the value in the account becomes
           (100 + 201.252) * (1 + 0.00417) = 302.507
       and so on.
    Write a program that prompts the user to enter a monthly saving amount and
    displays the account value after the sixth month. (In Exercise 5.30, you will
    use a loop to simplify the code and display the account value for any month.)
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise13_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the monthly saving amount: ");
        
        // Calculate the values
        double monthlyAmount = input.nextDouble(),
                accountValue = 0;
        accountValue = (accountValue + monthlyAmount) * 1.00417;
        accountValue = (accountValue + monthlyAmount) * 1.00417;
        accountValue = (accountValue + monthlyAmount) * 1.00417;
        accountValue = (accountValue + monthlyAmount) * 1.00417;
        accountValue = (accountValue + monthlyAmount) * 1.00417;
        accountValue = (accountValue + monthlyAmount) * 1.00417;
        
        // Print the result
        System.out.print("After the sixth month, the account value is $" + 
                (int)(accountValue * 100) / 100.0 );
    }
    
}
