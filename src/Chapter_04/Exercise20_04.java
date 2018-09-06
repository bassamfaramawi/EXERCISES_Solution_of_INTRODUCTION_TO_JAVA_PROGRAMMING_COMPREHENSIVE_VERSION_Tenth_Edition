/*
 4.20 (Process a string) Write a program that prompts the user to enter a string 
and displays its length and its first character.
 */
package Chapter_04;

import java.util.Scanner;  // Create a Scanner object

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise20_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        String string = input.nextLine();
        
        // Display  the results
        System.out.println("The string length is " + string.length());
        System.out.print("The first character is " + string.charAt(0));
    }
    
}
