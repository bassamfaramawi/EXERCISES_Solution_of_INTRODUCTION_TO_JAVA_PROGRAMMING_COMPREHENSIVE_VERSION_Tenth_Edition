/*
5.13 (Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
integer n such that n^3 is less than 12,000.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise13_05 {

    public static void main(String[] args) {
        int number = 0;  // Start from number 0
        int lastNumber = 0; // The number previous of current number
        
        while((number * number * number) < 12000) {
            lastNumber = number;
            number++;
        }
        
        // Display the result
        System.out.println("The largest number such that n^3 < 12000 is: " 
                + lastNumber);
    }
    
}
