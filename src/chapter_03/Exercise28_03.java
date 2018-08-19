/*
 **3.28 (Geometry: two rectangles) Write a program that prompts the user to enter 
the center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, 
as shown in Figure 3.9. Test your program to cover all cases.
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise28_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        // Prompt the user for entering r1's center x-, y-coordinates, width, and height
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble(),
                y1 = input.nextDouble(),
                w1 = input.nextDouble(),
                h1 = input.nextDouble();
        // Prompt the user for entering r2's center x-, y-coordinates, width, and height
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
         double x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                w2 = input.nextDouble(),
                h2 = input.nextDouble();
         
         // r2 rectangle doesn't overlap r1 rectangle
         if(Math.abs(Math.max(x1, x2) - Math.min(x1, x2)) > w1 + w2 &&
                 Math.abs(Math.max(y1, y2) - Math.min(y1, y2)) > h1 + h2)
             System.out.print("r2 does not overlap r1");
         
         //  r2 rectangle is inside r1
         else if(Math.abs(Math.max(x1, x2) - Math.min(x1, x2)) + (w2 / 2) <= w1 / 2 &&
                 Math.abs(Math.max(y1, y2) - Math.min(y1, y2)) + (h2 / 2) <= h1 / 2)
             System.out.print("r2 is inside r1");
         
         // r2 rectangle overlap r1 rectangle
         else
             System.out.print("r2 overlaps r1");
    }
    
}
