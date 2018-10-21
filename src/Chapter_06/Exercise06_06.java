/*
 *6.6 (Display patterns) Write a method to display a pattern as follows:
              1
            2 1
          3 2 1
...
n n-1 ... 3 2 1
The method header is
public static void displayPattern(int n)
 */
package Chapter_06;

import java.util.Scanner;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise06_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Invoke Scanner object
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        displayPattern(n);
    }
    
    public static void displayPattern(int n) {
        for(int i = 1; i <= n; i++){
            for(int k = n; k > 0; k--){
                System.out.printf("%3s", (k > i ? " " : k + ""));
            }
            System.out.println();
        }
    }
}
