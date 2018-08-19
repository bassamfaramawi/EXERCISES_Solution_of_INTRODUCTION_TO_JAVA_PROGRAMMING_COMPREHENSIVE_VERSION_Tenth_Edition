/*
 * *2.5 (Financial application: calculate tips) Write a program that reads the 
     subtotal and the gratuity rate, then computes the gratuity and total. For 
     example, if the user enters 10 for subtotal and 15% for gratuity rate, the 
     program displays $1.5 as gratuity and $11.5 as
 */

package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise05_02 {

    public static void main(String[] args) {
        //Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble(),
                gratuityRate = input.nextDouble(),
                gratuity, total;
        
        // Print the result
        System.out.print("The gratuity is $"  + 
                (gratuity = gratuityRate / 100 * subtotal) + 
                " and total is $" + (total = subtotal + gratuity));
    }
    
}
