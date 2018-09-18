/*
 *5.14 (Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise14_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter two positive integers
        System.out.print("Enter two positive integers: ");
        
        int n1 = input.nextInt(),
                n2 = input.nextInt(),
                d = Math.min(n1, n2),  // The minimum of n1 & n2
                gcd = 1;  // Initialize the greatest common divisor
        
        for(int n = d; n >1; n--) 
            if(n1 % n == 0 && n2 % n == 0) {
                gcd = n;
                break;
            }
        
        //  Display the result
        System.out.print("The gcd for " + n1 + " and " + n2 + " is: " + gcd);
    }
    
}
