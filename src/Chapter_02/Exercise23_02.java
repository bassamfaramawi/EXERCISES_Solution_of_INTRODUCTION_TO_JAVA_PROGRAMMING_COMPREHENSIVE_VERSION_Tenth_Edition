/*
 * *2.23 (Cost of driving) Write a program that prompts the user to enter the 
    distance to drive, the fuel efficiency of the car in miles per gallon, and 
    the price per gallon, and displays the cost of the trip
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise23_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        
        double cost = drivingDistance / milesPerGallon * pricePerGallon;
        
        // Print the result
        System.out.print("The cost of driving is $" + (int)(cost * 100) / 100.0);
    }
    
}
