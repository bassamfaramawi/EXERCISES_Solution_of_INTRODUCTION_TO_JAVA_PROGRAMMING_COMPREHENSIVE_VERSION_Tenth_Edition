/*
 *3.18 (Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in
pounds).
     c(w) = 3.5, if 0 < w < = 1
            5.5, if 1 , w < = 3
            8.5, if 3 < w < = 10
            10.5, if 10 < w < = 20
Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise18_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter the weight of the package (in pounds)
        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = input.nextDouble();  // Recieve the value
        
        // Check the weight and display the result
        if(weight <= 1)
            System.out.print("The shipping cost is 3.5 dollars");
        else if(weight <= 3)
            System.out.print("The shipping cost is 5.5 dollars");
        else if(weight <= 10)
            System.out.print("The shipping cost is 8.5 dollars");
        else if(weight <= 20)
            System.out.print("The shipping cost is 10.5 dollars");
        else if(weight > 50)
            System.out.print("The package cannot be shipped.");
    }
    
}
