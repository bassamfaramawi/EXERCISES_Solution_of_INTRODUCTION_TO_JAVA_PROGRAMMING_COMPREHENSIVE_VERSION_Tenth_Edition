/*
 **3.23 (Geometry: point in a rectangle?) Write a program that prompts the user 
to enter a point (x, y) and checks whether the point is within the rectangle 
centered at (0, 0) with width 10 and height 5. For example, (2, 2) is inside the 
rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b. 
(Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less 
than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal 
to 5.0 / 2. Test your program to cover all cases.)
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise23_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        // Assign the rectangle width and height
        final double WIDTH = 10.0;
        final double HEIGHT = 5.0;
        
        // Asking for entering a point
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble(),
                y = input.nextDouble();
        
        // Check if in the point inside the rectangle and display the result
        System.out.print("Point (" + x + ", " + y + ") is " + 
                (x <= WIDTH / 2 && y <= HEIGHT / 2 ? "" : "not ") + 
                "in the rectangle");
    }
    
}
