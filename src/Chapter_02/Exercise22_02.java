/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
   .java, to fix the possible loss of accuracy when converting a double value to 
   an int value. Enter the input as an integer whose last two digits represent 
   the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise22_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter an amount in integer, for example 1156: ");
        
        // Calculate the values
        int amount = input.nextInt(),
                remainingAmount = amount,
                numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        int numberOfPennies = remainingAmount;
        
        // Print the result
        System.out.println("Your amount " + amount + " consists of ");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.print("    " + numberOfPennies + " pennies");
    }
    
}
