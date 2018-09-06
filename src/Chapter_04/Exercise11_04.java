/*
 *4.11 (Decimal to hex) Write a program that prompts the user to enter an integer 
between 0 and 15 and displays its corresponding hex number.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise11_04 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter a decimal value (0 to 15)
        System.out.print("Enter a decimal value (0 to 15): ");
        
        int decimal = input.nextInt();
        
        if(decimal > 15 || decimal < 0)  // If the input isn't in (0 - 15) range
            System.out.print(decimal + " is an invalid input");
        else { // Otherwise display the hex value
            // Display the result
            System.out.print("The hex value is " );
            
            switch(decimal) {
                case 10 : System.out.print("A");
                          break;
                case 11 : System.out.print("B");
                          break;
                case 12 : System.out.print("C");
                          break;
                case 13 : System.out.print("D");
                          break;
                case 14 : System.out.print("E");
                          break;
                case 15 : System.out.print("F");
                          break;
                default : System.out.print(decimal);
            }
        }
    }
    
}
