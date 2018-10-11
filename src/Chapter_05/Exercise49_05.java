/*
 *5.49 (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
Write a program that prompts the user to enter a string and displays the number
of vowels and consonants in the string.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise49_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter a string:
        System.out.print("Enter a string: ");
        
        String string = input.nextLine().toUpperCase();
        
        int numberOfVowels = 0,  // Initialize the number of vowels
                numberOfConsonants = 0;  // Initialize the number of consonants
        
        for(int i = 0; i <string.length(); i++)
            if(string.charAt(i) == 'A' || string.charAt(i) == 'E' 
                    || string.charAt(i) == 'I' || string.charAt(i) == 'O' 
                    || string.charAt(i) == 'U')
                numberOfVowels++;
            
            else if(Character.isAlphabetic(string.charAt(i)))
                numberOfConsonants++;
        
        // Display the result
        System.out.println("The number of vowels is" + numberOfVowels);
        System.out.print("The number of consonants is" + numberOfConsonants);
    }
    
}
