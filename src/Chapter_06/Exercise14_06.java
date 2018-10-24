/*
 6.14 (Estimate p) p can be computed using the following series:
m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... 
       + (-1)^(i + 1) / 2i - 1)
≤
Write a method that returns m(i) for a given i and write a test program that 
displays the following table:

  i            m(i)
========================
  1            4.0000
  101          3.1515
  201          3.1466
  301          3.1449
  401          3.1441
  501          3.1436
  601          3.1433
  701          3.1430
  801          3.1428
  901          3.1427
*
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise14_06 {

    public static void main(String[] args) {
        System.out.printf("  %-10sm(i)\n====================\n", 
                "i");
        
        for(int i = 1; i <= 1000; i += 100) 
            System.out.printf("  %-10d%.4f\n", i, m(i));
    }
    
     public static double m(int i) {
        double sum = 0;  // Initialize the summation
        
        for(int n = 1; n <= i; n++)
            sum += (Math.pow(-1, n + 1) / (2 * n - 1));
        
        sum *= 4;
        
        return sum;
    }
}
