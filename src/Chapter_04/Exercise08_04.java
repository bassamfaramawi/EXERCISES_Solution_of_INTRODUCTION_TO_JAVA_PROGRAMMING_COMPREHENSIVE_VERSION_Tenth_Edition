/*
 *4.8 (Find the character of an ASCII code) Write a program that receives an 
ASCII code (an integer between 0 and 127) and displays its character.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise08_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter an ASCII code
        System.out.print("Enter an ASCII code: ");
        
        int ascii = input.nextInt();
        
        // Display the result
        System.out.print("The character for ASCII code " + ascii + " is " 
                + (char)ascii );
        
    }
    
}
