/*
 *3.25 (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) 
and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
The intersecting point of the two lines can be found by solving the following
linear equation:
          (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
          (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
This linear equation can be solved using Cramer’s rule (see Programming Exercise
3.3). If the equation has no solutions, the two lines are parallel (Figure 3.8c).
Write a program that prompts the user to enter four points and displays the 
intersecting point.

                  ax + by = e
                  cx + dy = f
                  x = (ed - bf) / (ad - bc)
                  y = (af - ec) / (ad - bc)
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise25_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
         
        // Asking for entering 4 points
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        // Receive values
        double x1 = input.nextDouble(),
                y1 = input.nextDouble(),
                x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                x3 = input.nextDouble(),
                y3 = input.nextDouble(),
                x4 = input.nextDouble(),
                y4 = input.nextDouble(),
                // Calculate a, b, c, d, e, f
                a = y1 - y2,
                b = x1 - x2,
                c = y3 - y4,
                d = x3 - x4,
                e = (y1 - y2)* x1 - (x1 - x2) * y1,
                f = (y3 - y4) * x3 - (x3 - x4) * y3,
                x, y;
        
        // If parallel lines
        if((a * d - b * c) == 0)
            System.out.print("The two lines are parallel");
        // Otherwise calculate point coordinates and display the result
        else {
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            
            System.out.print("The intersecting point is at (" + 
                    (int)(x * 1E4) / 1E4 + ", " + (int)(y * 1E4) / 1E4 + ")");
        }
                
    }
    
}
