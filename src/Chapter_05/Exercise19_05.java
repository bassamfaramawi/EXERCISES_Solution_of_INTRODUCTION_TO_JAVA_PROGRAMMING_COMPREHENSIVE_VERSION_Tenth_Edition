/*
 **5.19 (Display numbers in a pyramid pattern) Write a nested for loop that prints 
the following output:
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise19_05 {

    public static void main(String[] args) {
        String number;
        
        for(int n = 0; n <= 7; n++) { // A for loop for printing the table
            for(int k = -7; k <= 7; k++) 
                System.out.printf("%4s", number = (Math.abs(k) > n ? " " : 
                        (int)Math.pow(2, Math.abs(Math.abs(k) - n)) + ""));
            
            System.out.println();
        }
    }
    
}
