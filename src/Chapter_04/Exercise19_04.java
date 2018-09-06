/*
 4.19 (Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering 
the ISBN number as a string.
 */
package Chapter_04;

import java.util.Scanner;  // Create a Scanner object

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise19_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter first 9 digits as 1 integer number
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        
        // Receive value
        String digits = input.next();
        
        // Extract digits from the input string
        int d1 = Integer.parseInt(digits.substring(0, 1));
                
        int d2 =  Integer.parseInt(digits.substring(1, 2));
        
        int d3 =  Integer.parseInt(digits.substring(2, 3));
        
        int d4 =  Integer.parseInt(digits.substring(3, 4));
        
        int d5 =  Integer.parseInt(digits.substring(4, 5));
        
        int d6 =  Integer.parseInt(digits.substring(5, 6));
        
        int d7 =  Integer.parseInt(digits.substring(6, 7));
        
        int d8 =  Integer.parseInt(digits.substring(7, 8));
        
        int d9 =  Integer.parseInt(digits.substring(8, 9));
        
        // Compute d10 checksum
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
        // Display the result
        System.out.print("The ISBN-10 number is " + digits + 
                (d10 == 10 ? "X" : d10));
    }
    
}
