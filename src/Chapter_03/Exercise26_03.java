/*
 3.26 (Use the &&, || and ^ operators) Write a program that prompts the user to 
enter an integer and determines whether it is divisible by 5 and 6, whether it 
is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */
package Chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise26_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
         
        // Prompt the user for entering an integer:
        System.out.print("Enter an integer: ");
        // Receive value
        int  number = input.nextInt();
        
        // Check the cases and display the result
        System.out.println("Is " + number + " divisible by 5 and 6? " + 
                (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6? " + 
                (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 and 6, but not both? " + 
                (number % 5 == 0 ^ number % 6 == 0));
    }
    
}
