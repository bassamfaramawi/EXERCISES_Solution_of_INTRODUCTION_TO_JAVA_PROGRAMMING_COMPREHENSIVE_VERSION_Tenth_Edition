/*
 3.12 (Palindrome number) Write a program that prompts the user to enter a 
three-digit integer and determines whether it is a palindrome number. A number 
is palindrome if it reads the same from right to left and from left to right.
 */
package Chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise12_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter a three-digit integer
        System.out.print("Enter a three-digit integer: ");
        // Receive value
        int number = input.nextInt();
        // Extract 1st and 3rd digits
        int digit1 = number / 100,
                remaining = number % 100,
                digit3 = remaining % 10;
        // check if they are equal and display the result
        System.out.print(number + " is " + (digit1 == digit3 ? "" : "not") 
                + " a palindrome");
    }
    
}
