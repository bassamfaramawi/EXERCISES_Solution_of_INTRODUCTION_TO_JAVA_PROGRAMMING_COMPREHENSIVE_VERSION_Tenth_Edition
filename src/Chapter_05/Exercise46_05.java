/*
*5.46 (Reverse a string) Write a program that prompts the user to enter a string 
and displays the string in reverse order.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise46_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        String string = input.next();
        
        System.out.print("The reversed string is ");
        
        for(int i = string.length(); i > 0; i--)
            System.out.print(string.charAt(i-1));
        
    }
    
}
