/*
 *5.43 (Math: combinations) Write a program that displays all possible combinations
for picking two numbers from integers 1 to 7. Also display the total number of
all combinations.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise43_05 {

    public static void main(String[] args) {
        int count = 0;  // Initialize count
        
        for(int n = 1; n <= 7; n++)
            for(int i = n; i <= 7; i++){
                if(n == i) continue;
                System.out.println(n + " " + i);
                count++;
            }
        
        // Display the result
        System.out.print("The total number of all combinations is " + count);
    }
    
}
