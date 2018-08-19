/*
 * 2.15 (Geometry: distance of two points) Write a program that prompts the user 
   to enter two points (x1, y1) and (x2, y2) and displays their distance between 
   them. The formula for computing the distance is root square of ((x2 - x1)2 + 
   (y2 - y1)2). Note that you can use Math.pow(a, 0.5) to compute 2a.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise15_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble(),
                y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        
        // Calculate the values
        double x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2)),
                        0.5);
        
        // Print the result
        System.out.print("The distance between the two points is " + distance);
    }
    
}
