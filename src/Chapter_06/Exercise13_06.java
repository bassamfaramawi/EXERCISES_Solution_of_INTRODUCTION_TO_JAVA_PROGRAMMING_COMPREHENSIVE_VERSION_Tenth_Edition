/*
 *6.13 (Sum series) Write a method to compute the following series:
m(i) = 1 / 2 + 2 / 3 + ... + i / (i + 1)
Write a test program that displays the following table:
  i       m(i)
===================
  1       0.5000
  2       1.1667
  ...  
  19      16.4023
  20      17.3546
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise13_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("  %-10sm(i)\n====================\n", 
                "i");
        
        for(int i = 1; i <= 20; i++) 
            System.out.printf("  %-10d%.4f\n", i, m(i));
    }
    
    public static double m(int i) {
        double sum = 0;  // Initialize the summation
        
        for(int n = 1; n <= i; n++)
            sum += ((double)n / (n + 1));
        
        return sum;
    }
}
