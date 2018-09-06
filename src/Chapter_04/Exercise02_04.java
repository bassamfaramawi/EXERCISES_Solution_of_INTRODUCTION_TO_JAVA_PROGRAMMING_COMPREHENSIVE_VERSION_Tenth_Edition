/*
 3.2 (Geometry: great circle distance) The great circle distance is the distance between
        two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
        latitude and longitude of two points. The great circle distance between the two
        points can be computed using the following formula:
               d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        Write a program that prompts the user to enter the latitude and longitude of two
        points on the earth in degrees and displays its great circle distance. The average
        earth radius is 6,371.01 km. Note that you need to convert the degrees into toRadians
        using the Math.toRadians function since the Python trigonometric functions use
        toRadians. The latitude and longitude degrees in the formula are for north and west.
        Use negative to indicate south and east degrees.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */

import java.util.Scanner; // Import the Scanner class

public class Exercise02_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter point 1 (latitude and longitude) in degrees
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        
        double x1 = input.nextDouble(),
                y1 = input.nextDouble();
        
        // Prompt the user to enter point 2 (latitude and longitude) in degrees
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        
        double x2 = input.nextDouble(),
                y2 = input.nextDouble();
        
        // Convert the degrees ino toRadians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
        final double EARTH_RADIUS = 6371.01;  // earth radius in Km as a constant
        
        // Compute the great circle distance
        double d = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) 
                * Math.cos(x2) * Math.cos(y1 - y2));
        
        // Display the result
        System.out.print("The distance between the two points is " +  d + " km");

    }
    
}
