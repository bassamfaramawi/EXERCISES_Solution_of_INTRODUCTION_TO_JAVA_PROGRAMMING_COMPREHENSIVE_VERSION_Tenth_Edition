/*
 * 2.9 (Physics: acceleration) Average acceleration is defined as the change of 
    velocity divided by the time taken to make the change, as shown in the 
    following formula:
    a =  (v1 - v0) / t
    Write a program that prompts the user to enter the starting velocity v0 in 
    meters/ second, the ending velocity v1 in meters/second, and the time span t 
    in seconds, and displays the average acceleration.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise09_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter v0, v1, and t: ");
        
        // Calculate the values
        double v0 = input.nextDouble(),
                v1 = input.nextDouble(),
                t = input.nextDouble(),
                averageAcceleration;
        
        // Print the result
        System.out.print("The average acceleration is " + 
                (averageAcceleration = (int)(((v1 - v0) / t) * 10000) /10000.0));
    }
    
}
