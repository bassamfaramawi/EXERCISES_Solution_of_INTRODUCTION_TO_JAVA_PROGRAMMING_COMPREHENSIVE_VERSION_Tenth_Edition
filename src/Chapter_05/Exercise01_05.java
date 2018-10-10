/*
 *5.1 (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise01_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter integers
        System.out.print("Enter an integer, the input ends if it is 0: ");
        
        int number = input.nextInt(),  // Receive integer
                n = 0,  // Number of entered integer
                positives = 0, // Initialize positive integers
                negatives = 0;  // Initialize negative integers
        
        double total = 0;  // Initialize total
        
        // Receive integers until the input 0
        while(number != 0) {
            n++;
            if(number > 0) positives++; else negatives++;
            total = total + number;
            number = input.nextInt();
        }
        
        if(n == 0)  // If no entered but zero
            System.out.print("No numbers are entered except 0");
        
        else  // Otherwise display the result
            System.out.print("The number of positives is " + positives + 
                    "\nThe number of negatives is " + negatives + 
                    "\nThe total is " + total +
                    "\nThe average is " + (total / n));    
    }
    
}
