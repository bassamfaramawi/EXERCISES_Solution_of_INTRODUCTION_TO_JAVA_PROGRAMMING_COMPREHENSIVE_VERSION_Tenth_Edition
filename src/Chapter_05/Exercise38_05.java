/*
 **5.38 (Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise38_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter integers
        System.out.print("Enter a decimal integer: ");
        
        int decimal = input.nextInt();  // Receive integer
        
        String octal = "";  // Initialize the octal string
        
        int quotient = decimal;  // Initialize the quotient
        
        while(quotient != 0) {
            octal += (quotient % 8);
            quotient = quotient / 8;
        }
        
        // Display the octal value
        System.out.println("The corresponding octal of " + decimal + " is " 
                + octal);
    }
    
}
