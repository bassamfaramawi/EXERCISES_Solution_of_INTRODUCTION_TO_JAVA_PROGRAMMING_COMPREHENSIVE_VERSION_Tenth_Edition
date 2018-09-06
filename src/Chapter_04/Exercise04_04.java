/*
 4.4 (Geometry: area of a hexagon) The area of a hexagon can be computed using the
      following formula (s is the length of a side):
              Area = 6 * s * s / (4 * tan(PI / 6))
      Write a program that prompts the user to enter the side of a hexagon and 
      displays its area.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */

import java.util.Scanner; // Import the Scanner class

public class Exercise04_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter the side of the pentagon
        System.out.print("Enter the side:");
        
        double s = input.nextDouble();
        
        // Compute the area of the pentagon
        double area = 6 * s * s / (4 * Math.tan(Math.PI / 6));
        
        // Display the result
        System.out.printf("The area of the pentagon is %.2f" , area);
    }
    
}
