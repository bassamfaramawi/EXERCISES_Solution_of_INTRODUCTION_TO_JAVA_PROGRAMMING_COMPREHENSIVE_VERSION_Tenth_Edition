/*
 *5.44 (Computer architecture: bit-level operations) A short value is stored in 
16 bits. Write a program that prompts the user to enter a short integer and 
displays the 16 bits for the integer.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise44_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        // Prompt the user to enter a short value
        System.out.print("Enter a short number: ");
        
        short number = input.nextShort();
        
        // Display the result
        System.out.print("The bits are ");
        
        for(int n = 15; n >= 0; n--)
            System.out.print((number >> n) & 1);
    }
    
}
