/*
 *5.50 (Count uppercase letters) Write a program that prompts the user to enter 
a string and displays the number of the uppercase letters in the string.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise50_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        String string = input.nextLine();
        
        int numberOfUppercases = 0;  // Initialize the number of uppercases
        
        for(int i = 0; i < string.length(); i++)
            if(Character.isUpperCase(string.charAt(i)))
                numberOfUppercases++;
            
        // Display the result
        System.out.print("The number of uppercase letters is " + numberOfUppercases);
        
    }
    
}
