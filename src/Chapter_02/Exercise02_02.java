/*
 * 2.2 (Compute the volume of a cylinder) Write a program that reads in the radius
   and length of a cylinder and computes the area and volume using the following
   formulas:
   area = radius * radius * p
   volume = area * length
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise02_02 {

    public static void main(String[] args) {
        //Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
         // Asking for entering input
         System.out.print("Enter the radius and length of a cylinder: ");
         double radius = input.nextDouble(),
                length = input.nextDouble(),
                area, volume;
        
         // Print the result
         System.out.println("The area is " + 
                (area = (int)(radius * radius * Math.PI * 10000) / 10000.0));
         System.out.print("The volume is " + 
                (volume = (int)(area * length * 10) / 10.0));
        
                
    }
    
}
