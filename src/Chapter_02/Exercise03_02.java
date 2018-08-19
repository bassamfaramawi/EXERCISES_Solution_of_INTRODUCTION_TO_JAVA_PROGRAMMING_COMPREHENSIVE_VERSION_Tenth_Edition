/*
 * 2.3 (Convert feet into meters) Write a program that reads a number in feet, 
   converts it to meters, and displays the result. One foot is 0.305 meter
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise03_02 {

    public static void main(String[] args) {
        //Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble(),
                meters;
        // Print the result
        System.out.print(feet + " feet is " + (meters = feet * 0.305) + 
                (meters > 1 ? " meters" : " meter"));
    }
    
}
