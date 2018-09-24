/*
 *5.47 (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. 
It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
which is calculated from the other digits using the following formula:
  10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10

If the checksum is 10, replace it with 0. Your program should read the input as a
string.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise47_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter the first 12 digits of an ISBN-13 as a string
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        
        String digits = input.next();
        
        if(digits.length() != 12){  // If the length != 12 exit the program
            System.out.print(digits + " is an invalid input");
            System.exit(0);
        }
        
        // Compute the checksum
        int ISBN_13 = 10 - (digits.charAt(0) - '0'
                + 3 * (digits.charAt(1) - '0')
                + digits.charAt(2) - '0'
                + 3 * (digits.charAt(3) - '0')
                + digits.charAt(4) - '0'
                + 3 * (digits.charAt(5) - '0')
                + digits.charAt(6) - '0'
                + 3 * (digits.charAt(7) - '0')
                + digits.charAt(8) - '0'
                + 3 * (digits.charAt(9) - '0')
                + digits.charAt(10) - '0'
                + 3 * (digits.charAt(11) - '0')) % 10;
        
        ISBN_13 = (ISBN_13 == 10 ? 0 : ISBN_13);  // If checksum = 10 set it 0
        
        // Display the result
        System.out.print("The ISBN-13 number is " + digits + ISBN_13);
    }
    
}
