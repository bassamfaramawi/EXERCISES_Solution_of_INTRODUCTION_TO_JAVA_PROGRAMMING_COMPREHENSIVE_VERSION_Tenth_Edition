/*
 * 2.10 (Science: calculating energy) Write a program that calculates the energy 
needed to heat water from an initial temperature to a final temperature. Your 
program should prompt the user to enter the amount of water in kilograms and the 
initial and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise10_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the amount of water in kilograms: ");
        
        double weight = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        
        // Calculate the values
        double finalTemperature = input.nextDouble(),
                energy = weight * 4184 * (finalTemperature - initialTemperature);
        
        // Print the result
        System.out.print("The energy needed is " + energy);
    }
    
}
