/*
 **3.19 (Compute the perimeter of a triangle) Write a program that reads three 
edges for a triangle and computes the perimeter if the input is valid. Otherwise, 
display that the input is invalid. The input is valid if the sum of every pair of 
two edges is greater than the remaining edge.
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise19_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter 3 edges in cm
        System.out.print("Enter the 3 edges in cm: ");
        // Recieve the value
        double edge1 = input.nextDouble(),
                edge2 = input.nextDouble(),
                edge3 = input.nextDouble();
        
        // Check if the input is valid and diplay the result
        if((edge1 + edge2) > edge3 && (edge2 + edge3) > edge1 && 
                (edge1 + edge3) > edge2) 
            System.out.print("Perimter = " + (edge1 + edge2 + edge3));
        else 
            System.out.print("The input is invalid.");
    }
    
}
