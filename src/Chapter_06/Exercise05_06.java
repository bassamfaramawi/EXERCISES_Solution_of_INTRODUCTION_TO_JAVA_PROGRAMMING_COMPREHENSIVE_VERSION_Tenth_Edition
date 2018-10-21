/*
 *6.5 (Sort three numbers) Write a method with the following header to display 
three numbers in increasing order:
public static void displaySortedNumbers(double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
 */
package Chapter_06;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise05_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Invoke Scanner object
        
        // Prompt the user to enter 3 numbers
        System.out.print("Enter 3 numbers: ");
        
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        // Invoke displaySortedNumbers() method to sort the numbers 
        displaySortedNumbers(num1, num2, num3);
    }
    
    // Display 3 numbers in increasing order
    public static void displaySortedNumbers( double num1, double num2, 
            double num3) {

        double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
    
}
