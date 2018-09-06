/*
   4.1 (Geometry: area of a pentagon) Write a program that prompts the user to enter
       the length from the center of a pentagon to a vertex and computes the area of 
       the pentagon, as shown in the following figure.
       The formula for computing the area of a pentagon is
             Area =3 * 3 ** 0.5 / 2 * s ** 2
       ,where s is the length of a side. The side can be computed using the formula
             s = 2 * r * sin(pi / 5)
       where r is the length from the center of a pentagon to a vertex. Round up two
       digits after the decimal point.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */

import java.util.Scanner; // Import the Scanner class

public class Exercise01_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter the length from the center to a vertex
        System.out.print("Enter the length from the center to a vertex: ");
       
        double r = input.nextDouble();
        
        // Compute the side length
        double s = 2 * r * Math.sin(Math.PI / 5);
        
        // Compute the pentagon area
        double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
        
        // Display the result
        System.out.printf("The area of the pentagon is %.2f" , area);
    }
    
}
