/*
 *5.35 (Summation) Write a program to compute the following summation.
         1/(1 + 2^0.5) + 1/(2^0.5 + 3^0.5) + 1/(3^0.5 + 4^0.5) + ... 
         + 1/(624^0.5 + 625^0.5) 
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise35_05 {

    public static void main(String[] args) {
        double sum = 0;  // Initialize the summation
        for(int n = 1; n < 625; n++)
            sum += (1.0 / (Math.sqrt(n) + Math.sqrt(n + 1)));
        
        // Display the summation
        System.out.print("The summation is: " + sum);
    }
    
}
