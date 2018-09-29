/*
 *5.16 (Find the factors of an integer) Write a program that reads an integer and 
displays all its smallest factors in increasing order. For example, if the input 
integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise16_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        
        int number = input.nextInt();
        
        int n = 1;  // Start count from after 1
        
        System.out.print("The smallest factors for " + number + " are: ");
        
        while (n < number) {
            n++;
            if(number % n != 0)
                continue;  // If n is not a factor resume counting
            
            // Otherwise display the factor
            System.out.print(n + (n == number ? "" : ", "));
            number /= n;  // set the new number
            n = 1;  // Reset counting
        }
    }
    
}
