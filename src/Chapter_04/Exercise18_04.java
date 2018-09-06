/*
 *4.18 (Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology
 */
package Chapter_04;

import java.util.Scanner; // Create a Scanner object

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise18_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter two characters
        System.out.print("Enter two characters: ");
        
        String towCharacters = input.next();
        
        // Extract the first and second characters from the input
        char major = towCharacters.toUpperCase().charAt(0),
                status = towCharacters.charAt(1);
        
        // If invalid input
        if(major != 'M' &&  major != 'C' &&  major != 'I' ||  
                (status != '1' &&  status != '2' &&  status != '3' && status != '4'))
            System.out.append("Invalid input");
        
        // Otherwise display the major and status
        else {
            switch(major) {
                case 'M': System.out.print("Mathematics ");
                          break;
                case 'C': System.out.print("Computer Science ");
                          break;
                case 'I': System.out.print("Information Technology ");
            }
            
            switch(status) {
                case '1': System.out.print("Freshman");
                          break;
                case '2': System.out.print("Sophomore");
                          break;
                case '3': System.out.print("Junior");
                          break;
                case '4': System.out.print("Senior");
            }
        }
        
    }
    
}
