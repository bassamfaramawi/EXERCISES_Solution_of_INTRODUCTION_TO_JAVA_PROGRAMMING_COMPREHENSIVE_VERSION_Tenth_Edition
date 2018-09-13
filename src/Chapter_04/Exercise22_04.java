/*
 4.22 (Check substring) Write a program that prompts the user to enter two strings 
and reports whether the second string is a substring of the first string.
 */
package Chapter_04;

import java.util.Scanner;  // Create a Scanner object

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise22_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter string s1
        System.out.print("Enter string s1: ");
        
        String s1 = input.nextLine();
        
        //Prompt the user to enter string s2
        System.out.print("Enter string s2: ");
        
        String s2 = input.nextLine();
        
        // Display the result
        System.out.print(s2 + " is " + (s1.contains(s2) ? "a" : "not a") + 
                " substring of " + s1);
    }
    
}
