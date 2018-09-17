/*
 5.12 (Find the smallest n such that n^2 > 12,000) Use a while loop to find the 
smallest integer n such that n^2 is greater than 12,000.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise12_05 {

    public static void main(String[] args) {
        int number = 0;  // Start from number 0
        
        while((number * number) < 12000)
            number++;
        
        // Display the result
        System.out.println("The smallest number such that n^2 > 12000 is: " 
                + number);
    }
    
}
