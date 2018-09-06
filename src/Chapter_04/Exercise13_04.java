/*
 *4.13 (Vowel or consonant?) Write a program that prompts the user to enter a 
string and check whether the string is a vowel or consonant.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise13_04 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter a string
        System.out.print("Enter a letter: ");
        
        String string = input.next();
        
        char letter = string.toLowerCase().charAt(0);
        
        // The input is invalid if its length > 1 or not a string
        if(string.length() > 1 || !Character.isAlphabetic(letter))
            System.out.print(string + " is an invalid input");
        
        // Otherwise display if vowel or consonant
        else {
            System.out.print(string + " is a " + ((letter == 'a' || letter == 'e' 
                    || letter == 'i' || letter == 'o' || letter == 'u') 
                    ? "vowel" : "consonant")); 
        }
    }
    
}
