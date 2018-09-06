/*
 *3.32 (Geometry: point position) Given a directed line from point p0(x0, y0) to 
p1(x1, y1), you can use the following condition to decide whether a point p2(x2, 
y2) is on the left of the line, on the right, or on the same line:
                                           
                                              (> 0) p2 is on the left side of the line
(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)===  (= 0) p2 is on the same line
                                              (< 0) p2 is on the right side of the line


 */
package Chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise32_03 {

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
                
        // If position value > 0 the point is  on the left side
        if(position > 0) 
            System.out.print("(" + x2 + ", " + y2 + ") is on the left side "
                    + "of the line from (" + x0 + ", " + y0 + ") to (" + 
                    x1 + ", " + y1 + ")");
        
        // If position value = 0 the point is on the same line
        else if(position == 0)
            System.out.print("(" + x2 + ", " + y2 + ") is on the line from (" 
                    + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        
        // If position value , 0 the point is  on the right side
        else
            System.out.print("(" + x2 + ", " + y2 + ") is on the right side "
                    + "of the line from (" + x0 + ", " + y0 + ") to (" + 
                    x1 + ", " + y1 + ")");
    }
    
}
