/*
 *6.4 (Display an integer reversed) Write a method with the following header to 
display an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer and displays its reversal.
 */
package Chapter_06;

import java.util.Scanner;  // Import Scanner classimport java.lang.Math;

/**
 *
 * @author Administrator
 */
public class Exercise04_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Invoke Scanner object
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Display the reversal
        reverse(number);
    }
    
    
    // Display an integer in reverse order
    public static void reverse(int number) {
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
        
        // Print the reversal number
        System.out.print("Reversal number is " + reverse);
    }
}
