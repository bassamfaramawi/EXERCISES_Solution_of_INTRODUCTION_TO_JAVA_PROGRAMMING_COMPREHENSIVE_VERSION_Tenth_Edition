/*
 **3.29 (Geometry: two circles) Write a program that prompts the user to enter 
the center coordinates and radii of two circles and determines whether the second 
circle is inside the first or overlaps with the first, as shown in Figure 3.10. 
(Hint: circle2 is inside circle1 if the distance between the two centers 6 = 
|r1 - r2| and circle2 overlaps circle1 if the distance between the two centers 
<= r1 + r2. Test your program to cover all cases.)
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise29_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        // Prompt the user to enter circle1's center x-, y-coordinates, and radius
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble(),
                y1 = input.nextDouble(),
                r1 = input.nextDouble();
        
        // Prompt the user to enter circle2's center x-, y-coordinates, and radius
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                r2 = input.nextDouble();
        
        // Calculate the distance between tow centers
        double distance = Math.pow((x2 - x1) * (x2 - x1) + 
                (y2 - y1) * (y2 - y1), 0.5);
        
        // Circle2 (the smallest circle) is inside circle1
        if(distance <= Math.abs(r1 - r2))
            System.out.print("circle2 is inside circle1");
        
        // Circle2 overlaps circle1
        else if(distance <= Math.abs(r1 + r2))
            System.out.print("circle2 overlaps circle1");
        
        // otherwise circle2 does not overlap circle1
        else
             System.out.print("circle2 does not overlap circle1");
    }
    
}
