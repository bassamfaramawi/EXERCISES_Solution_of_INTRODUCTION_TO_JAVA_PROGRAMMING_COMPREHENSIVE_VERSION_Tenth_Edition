/*
*5.24 (Sum a series) Write a program to sum the following series:

      1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99

 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise24_05 {

    public static void main(String[] args) {
        int n = 97;  // The series count
        double sum  = 0;  // Initialize the summation
        
        // Display the summmation
        System.out.print("The summation of the series 1/3 + ... + 97/99 is: ");
        for(int i = 1; i <= n; i += 2)
            sum += (i * 1.0 / (i + 2));
        System.out.println(sum);
    }
    
}
