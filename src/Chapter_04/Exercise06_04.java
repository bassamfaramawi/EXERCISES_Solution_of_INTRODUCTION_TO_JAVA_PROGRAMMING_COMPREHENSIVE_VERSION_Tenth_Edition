/*
 *4.6 (Random points on a circle) Write a program that generates three random points
on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
formed by these three points, (Hint: Generate a random angle a in radians between 0 
and 2p, and the point determined by this angle is (r*cos(a), r*sin(a)).)
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise06_04 {

    public static void main(String[] args) {
        double r = 40;   // The circle radius
        
        // Generate the three alpha angles
        double alpha1 = Math.random() * Math.toRadians(360);
        double alpha2 = Math.random() * Math.toRadians(360);
        double alpha3 = Math.random() * Math.toRadians(360);
        
        // Compute the coordinates of the three points
        double x1 = r * Math.cos(alpha1),
                y1 = r * Math.sin(alpha1),
                x2 = r * Math.cos(alpha2),
                y2 = r * Math.sin(alpha2),
                x3 = r * Math.cos(alpha3),
                y3 = r * Math.sin(alpha3);
        
        // Compute the 3 points formed on the circle
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
        
        // Display the results
        System.out.printf("Circle with radius = 40 and centered at (0, 0) has a "
                + "\ntriangle formed  from three random points: "
                + "\n(%.2f, %.2f), (%.2f, %.2f) and (%.2f, %.2f)" , x1 , y1 , x2 , y2 , x3 , y3);
        System.out.printf("\nand 3 angles:\n%.2f\n%.2f\n%.2f" , A , B , C);
    }
    
}
