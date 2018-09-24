/*
 *5.48 (Process string) Write a program that prompts the user to enter a string 
and displays the characters at odd positions.
 */
package Chapter_05;

import java.util.Scanner;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise48_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        String string = input.nextLine();
        
        for(int i = 0; i < string.length(); i++)
            System.out.print((i % 2 == 0 ? string.charAt(i) : ""));
        
    }
    
}
