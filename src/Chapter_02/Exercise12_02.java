/*
 * 2.12 (Physics: finding runway length) Given an airplane’s acceleration a and 
   take-off speed v, you can compute the minimum runway length needed for an 
   airplane to take off using the following formula:
        length = v2 / 2a
   Write a program that prompts the user to enter v in meters/second (m/s) and 
   the acceleration a in meters/second squared (m/s2), and displays the minimum 
   runway length
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise12_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter speed and acceleration: ");
        
        // Calculate the values
        double speed = input.nextDouble(),
                acceleration = input.nextDouble(),
                length = (int)(speed * speed / (2 * acceleration) * 1000) / 1000.0;
        
        // Print the result
        System.out.print("The minimum runway length for this airplane is " + 
                length);
    }
    
}
