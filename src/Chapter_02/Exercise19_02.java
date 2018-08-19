/*
 * *2.19 (Geometry: area of a triangle) Write a program that prompts the user to 
    enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays 
    its area. The formula for computing the area of a triangle is
        s = (side1 + side2 + side3)/2
        area = sqrt(s * (s - side1) * (s - side2) * (s - side3))
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise19_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble(),
                y1 = input.nextDouble(),
                x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                x3 = input.nextDouble(),
                y3 = input.nextDouble();
        
        // Calculate the values
        double side1 = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2)),0.5),
                side2 = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 -y2, 2)),0.5),
                side3 = Math.pow((Math.pow(x1 - x3, 2) + Math.pow(y1 -y3, 2)),0.5),
                s = (side1 + side2 + side3) /2,
                area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        
        // Print the result
        System.out.print("The area of the triangle is " + (int)(area *  10) / 10.0);
    }
    
}
