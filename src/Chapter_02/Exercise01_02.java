/*
 * 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius 
   degree in a double value from the console, then converts it to Fahrenheit and 
   displays the result. The formula for the conversion is as follows:
   fahrenheit = (9 / 5) * celsius + 32
 Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise01_02 {

    public static void main(String[] args) {
        //Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble(),
                fahrenhiet;
        
        // Print the result
        System.out.print(celsius + " Celsius is " + 
                (fahrenhiet = (9.0 / 5) * celsius + 32) + " Fahrenhiet");
    }
    
}
