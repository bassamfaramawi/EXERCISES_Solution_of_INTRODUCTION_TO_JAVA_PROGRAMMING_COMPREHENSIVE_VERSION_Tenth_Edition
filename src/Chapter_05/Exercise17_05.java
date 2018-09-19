/*
 **5.17 (Display pyramid) Write a program that prompts the user to enter an 
integer from 1 to 15 and displays a pyramid.
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise17_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter an integer from 1  to 15
        System.out.print("Enter an integer from 1 to 15: ");
        
        int number =  input.nextInt();
        
        for(int n = 1; n <= number; n++) { // A for loop for printing the table
            for(int k = -number; k <= number; k++) 
                System.out.print((Math.abs(k) > n ? "  " :
                        (k == 0 || k == 1 ? "" : Math.abs(k) +" ")));
            
            System.out.println();
        }
        
    }
    
}
