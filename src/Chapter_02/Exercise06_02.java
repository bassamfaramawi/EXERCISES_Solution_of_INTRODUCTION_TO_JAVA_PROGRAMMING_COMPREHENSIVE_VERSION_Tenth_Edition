/*
 ***2.6 (Sum the digits in an integer) Write a program that reads an integer 
     between 0 and 1000 and adds all the digits in the integer. For example, 
     if an integer is 932, the sum of all its digits is 14.
     Hint: Use the % operator to extract digits, and use the / operator to 
     remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */

package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise06_02 {

    public static void main(String[] args) {
        //Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt(),
                hundreds = number / 100,
                tens = (number %= 100) / 10,
                ones = number % 10,
                sumOfDigits;
        
        // Print the result
        System.out.print("The sum of the digits is " + 
                (sumOfDigits = hundreds + tens + ones));
        
    }
    
}
