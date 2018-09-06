/*
*4.15 (Phone key pads) The international standard letter/number mapping found on 
the telephone is shown below:
Write a program that prompts the user to enter a letter and displays its corresponding
number.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise15_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        
        char letter = input.next().toUpperCase().charAt(0);
        
        // Display the results
        switch(letter) {
            case 'A': 
            case 'B': 
            case 'C': System.out.print("The corresponding number is " + 2);
                      break;
            case 'D': 
            case 'E': 
            case 'F': System.out.print("The corresponding number is " + 3);
                      break;
            case 'G': 
            case 'H': 
            case 'I': System.out.print("The corresponding number is " + 4);
                      break;
            case 'J': 
            case 'K': 
            case 'L': System.out.print("The corresponding number is " + 5);
                      break;
            case 'M': 
            case 'N': 
            case 'O': System.out.print("The corresponding number is " + 6);
                      break;
            case 'P':
            case 'Q': 
            case 'R': 
            case 'S': System.out.print("The corresponding number is " + 7);
                      break;
            case 'T': 
            case 'U': 
            case 'V': System.out.print("The corresponding number is " + 8);
                      break;
            case 'W':
            case 'X': 
            case 'Y': 
            case 'Z': System.out.print("The corresponding number is " + 9);
                      break;
            // Otherwise the letter is invalid          
            default: System.out.print(letter + " is an invalid input");
            }
    }
    
}
