/*
 * *3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved 
        using Cramer’s rule given in Programming Exercise 1.13. Write a program 
        that prompts the user to enter a, b, c, d, e, and f and displays the result. 
        If ad - bc is 0, report that “The equation has no solution.”
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise03_03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter a, b, c, d, e and f
        System.out.print("Enter a, b, c, d, e, f: "); 
        // Receive values
        double a = input.nextDouble(),
                b = input.nextDouble(),
                c = input.nextDouble(),
                d = input.nextDouble(),
                e = input.nextDouble(),
                f = input.nextDouble(),
                x,y;
        
        if((a * d - b * c) == 0) // The equation has no solution
            System.out.print("The equation has no solution");
        else { //Other than calculate x and y and display the results
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            
            System.out.print("x is " + x + " and y is " + y);
        }
    }
    
}
