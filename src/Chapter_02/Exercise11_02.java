/*
 * 2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the 
   user to enter the number of years and displays the population after the number 
   of years. Use the hint in Programming Exercise 1.11 for this program. The 
   population should be cast into an integer.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 
 */
public class Exercise11_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        
        // Print the result
        System.out.print("The population in 5 years is " + 
                (int)(312_032_486 + 3600 * 24 * 365 * numberOfYears *
                        (1.0 / 7 - 1.0 / 13 + 1.0 /45)));
    }
    
}
