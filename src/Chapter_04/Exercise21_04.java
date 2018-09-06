/*
 *4.21 (Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid.
 */
package Chapter_04;

import java.util.Scanner;  // Create a Scanner object

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise21_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter a SSN in the format DDD-DD-DDDD
        System.out.print("Enter a SSN: ");
        
        String ssn = input.nextLine(); // Receive the input
        
        boolean isValidLength = ssn.length() == 11;  // Check string length
        
          // Check string digits
        boolean isDigits = Character.isDigit(ssn.charAt(0)) 
                && Character.isDigit(ssn.charAt(1))
                && Character.isDigit(ssn.charAt(2))
                && Character.isDigit(ssn.charAt(4))
                && Character.isDigit(ssn.charAt(5))
                && Character.isDigit(ssn.charAt(7))
                && Character.isDigit(ssn.charAt(8))
                && Character.isDigit(ssn.charAt(9))
                && Character.isDigit(ssn.charAt(10));
        
        // Check the format
        boolean isValidFormat = isValidLength && isDigits &&
                ssn.charAt(3) == '-' && ssn.charAt(6) == '-';
        
        // Display the result
        System.out.print(ssn + " is " + (isValidFormat ? "a valid" : "an invalid") 
                + " social security number");
    }
    
}
