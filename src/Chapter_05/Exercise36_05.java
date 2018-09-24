/*
**5.36 (Business application: checking ISBN ) Use loops to simplify Programming
Exercise 3.9.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise36_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter first 9 digits as 1 integer number
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        // Receive value
        int digits = input.nextInt(),
                remaining = digits,
                numberOfDigits = 9,
                d10 = 0;
        
        // Use loop to calculate the checksum
        for(int n = 1; n <= numberOfDigits; n++) {
            d10 += ((int)(remaining / Math.pow(10, numberOfDigits - n)) * n);
            remaining = (int)(digits % Math.pow(10, numberOfDigits - n));
            if(n == numberOfDigits) d10 %= 11;
        }
        
        // Display the result
        System.out.print("The ISBN-10 number is " + digits + 
                (d10 == 10 ? "X" : d10));
    }
    
}
