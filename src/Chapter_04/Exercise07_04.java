/*
 *4.7 (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one 
point at the 0 o’clock position. Write a program that prompts the user to enter the 
radius of the bounding circle of a pentagon and displays the coordinates of the five 
corner points on the pentagon.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise07_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter the radius of the bounding circle
        System.out.print("Enter the radius of the bounding circle: ");
        
        double r = input.nextDouble();  // Receive value
        
        // Compute the 5 points coordinates
        double x1 = r * Math.cos(Math.toRadians(90)),
                y1 = r * Math.sin(Math.toRadians(90)),
                x2 = r * Math.cos(Math.toRadians((360 / 5) + 90)),
                y2 = r * Math.sin(Math.toRadians((360 / 5) + 90)),
                x3 = r * Math.cos(Math.toRadians((360 * 2 / 5) + 90)),
                y3 = r * Math.sin(Math.toRadians((360 * 2 / 5) + 90)),
                x4 = r * Math.cos(Math.toRadians((360 * 3 / 5) + 90)),
                y4 = r * Math.sin(Math.toRadians((360 * 3 / 5) + 90)),
                x5 = r * Math.cos(Math.toRadians((360 * 4 / 5) + 90)),
                y5 = r * Math.sin(Math.toRadians((360 * 4 / 5) + 90));
               
        
        // Display the results
        System.out.print("The coordinates of five points on the pentagon are\n");
        System.out.printf("(%.4f, %.4f)\n(%.4f, %.4f)\n(%.4f, %.4f)\n(%.4f, %.4f)"
                + "\n(%.4f, %.4f)", x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);
        
    }
    
}
