/*
 4.12 (Hex to binary) Write a program that prompts the user to enter a hex digit 
and displays its corresponding binary number.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise12_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter a hex digit
        System.out.print("Enter a hex digit: ");
        
        String hex = input.next().toUpperCase();
        
        // The input is invalid if it is a digit > 9 or < 0 or is alphabetic > 'F'
        if(hex.length() > 1 
                || (Character.isAlphabetic(hex.charAt(0)) && hex.charAt(0) > 'F'))
            System.out.print(hex + " is an invalid input");
        
        // Otherwise display the binary form of the hex digit
        else
            System.out.print("The binary value is " + 
                    Integer.toBinaryString(Integer.parseInt(hex, 16)) );  
    }
    
}
