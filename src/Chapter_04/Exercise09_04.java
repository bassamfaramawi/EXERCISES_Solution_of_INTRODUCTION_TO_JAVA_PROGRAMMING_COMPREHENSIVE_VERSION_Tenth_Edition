/*
 *4.9 (Find the Unicode of a character) Write a program that receives a character 
and displays its Unicode.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise09_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        
        String character = input.next();
        
        // Display the result
        System.out.print("The Unicode for the character " + character + " is " 
                + (int)character.charAt(0) );
    }
    
}
