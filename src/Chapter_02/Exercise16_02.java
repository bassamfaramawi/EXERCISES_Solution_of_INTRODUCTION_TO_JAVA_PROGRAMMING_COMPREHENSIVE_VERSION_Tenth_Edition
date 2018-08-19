/*
 * 2.16 (Geometry: area of a hexagon) Write a program that prompts the user to 
   enter the side of a hexagon and displays its area. The formula for computing 
   the area of a hexagon is
      Area = 3 * square root(3) / 2 * s2
   where s is the length of a side.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise16_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the side: ");
        
        // Calculate the values
        double side = input.nextDouble(),
                area = 3 * Math.pow(3, 0.5) / 2 * side * side;
        
        // Print the result
        System.out.print("The area of the hexagon is " + 
                (int)(area * 10000) / 10000.0);
    }
    
}
