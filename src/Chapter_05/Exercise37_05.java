/*
 **5.37 (Decimal to binary) Write a program that prompts the user to enter a 
decimal integer and displays its corresponding binary value. Don’t use Java’s 
Integer.toBinaryString(int) in this program.
 */
package Chapter_05;

import java.util.Scanner;  // Import the Sxanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise37_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter integers
        System.out.print("Enter a decimal integer: ");
        
        int decimal = input.nextInt();  // Receive integer
        
        String binary = "";  // Initialize the binary string
        
        int quotient = decimal;  // Initialize the quotient
        
        while(quotient != 0) {
            binary += (quotient % 2 == 0 ? "0" : "1");
            quotient = quotient / 2;
        }
        
        // Display the binary value
        System.out.println("The corresponding binary of " + decimal + " is " 
                + binary);
    }
    
}
