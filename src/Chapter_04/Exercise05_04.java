/*
 *3.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
      which all sides are of the same length and all angles have the same degree (i.e., the
      polygon is both equilateral and equiangular). The formula for computing the area
      of a regular polygon is
         Area = n * s * s / (4 * math.tan(math.pi / n))
      Here, s is the length of a side. Write a program that prompts the user to enter the
      number of sides and their length of a regular polygon and displays its area.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */

import java.util.Scanner; // Import the Scanner class

public class Exercise05_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter the number of sides of the pentagon
        System.out.print("Enter the number of sides:");
        double n = input.nextDouble();
        
        // Prompt the user to enter the side of the pentagon
        System.out.print("Enter the side:");
        
        double s = input.nextDouble();
        
        // Compute the area of the pentagon
        double area = n * s * s / (4 * Math.tan(Math.PI / n));
        
        // Display the result
        System.out.printf("The area of the pentagon is %.2f", area);
    }
    
}
