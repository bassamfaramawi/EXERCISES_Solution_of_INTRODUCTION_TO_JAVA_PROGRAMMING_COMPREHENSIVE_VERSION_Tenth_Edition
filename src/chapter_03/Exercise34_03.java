/*
 *3.34 (Geometry: point on line segment) Programming Exercise 3.32 shows how to 
test whether a point is on an unbounded line. Revise Programming Exercise 3.32 
to test whether a point is on a line segment. Write a program that prompts the 
user to enter the three points for p0, p1, and p2 and displays whether p2 is on 
the line segment from p0 to p1.
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise34_03 {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Asking to enter three points for p0, p1, and p2
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble(),
                y0 = input.nextDouble(),
                x1 = input.nextDouble(),
                y1 = input.nextDouble(),
                x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                // Calculate the position
                position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        
        // point is on a line segment if position = 0 and x2 is between x0 and x1
        if(position == 0 && x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1))
            System.out.print("(" + x2 + ", " + y2 + 
                    ") is on the line segment from (" + x0 + ", " + y0 + 
                    ") to (" + x1 + ", " + y1 + ")");
        
        // Otherwise it is not on the line segment
        else
            System.out.print("(" + x2 + ", " + y2 + 
                    ") is not on the line segment from (" + x0 + ", " + y0 + 
                    ") to (" + x1 + ", " + y1 + ")");
    }
}
