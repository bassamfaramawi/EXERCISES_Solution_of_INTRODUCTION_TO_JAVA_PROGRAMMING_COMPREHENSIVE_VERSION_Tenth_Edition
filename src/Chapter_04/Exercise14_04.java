/*
 *4.14 (Convert letter grade to number) Write a program that prompts the user to 
enter a letter grade A, B, C, D, or F and displays its corresponding numeric value 
4, 3, 2, 1, or 0.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise14_04 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter a letter grade
        System.out.print("Enter a letter grade: ");
        
        char letter = input.next().toUpperCase().charAt(0);
        
        // Display the results
        switch(letter) {
            case 'A': System.out.print("The numeric value for grade A is 4");
                      break;
            case 'B': System.out.print("The numeric value for grade B is 3");
                      break;
            case 'C': System.out.print("The numeric value for grade C is 2");
                      break;
            case 'D': System.out.print("The numeric value for grade D is 1");
                      break;
            case 'F': System.out.print("The numeric value for grade F is 0");
                      break;
            // Otherwise the letter is invalid          
            default: System.out.print(letter + " is an invalid grade");
            }
    }
    
}
