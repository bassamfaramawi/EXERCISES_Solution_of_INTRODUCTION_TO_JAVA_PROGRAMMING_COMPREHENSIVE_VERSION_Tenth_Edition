/*
 **6.3 (Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
 */
package Chapter_06;

import java.util.Scanner;  // Import Scanner class
import java.lang.Math;  // Import Math functions

public class Exercise03_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Invoke Scanner object
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Check and display the result
        System.out.print(number + (isPalindrome(number) ? " is a palindrome "
                + "number" : " is not a palindrome number"));
    }
    
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) {
        int length = 0;  // Initialize the length of the number
        int n = number; 
        int reverse = 0;
        
        // Calculate the lenght of the number
        while(n > 0) {
            n = n / 10;
            length ++;
        }
        
        // Calculate the reversal number
        while(length > 0) {
            reverse += ((number % 10) * Math.pow(10, --length));
            number = number / 10;
        }
        
        return reverse;
    }
    
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
}
