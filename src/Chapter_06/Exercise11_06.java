/*
 6.11 (Financial application: compute commissions) Write a method that computes 
the commission, using the scheme in Programming Exercise 5.39. The header of the
method is as follows:
public static double computeCommission(double salesAmount)
Write a test program that displays the following table:

  Sales Amount      Commission
=================================
  10000             900.0
  15000             1500.0
  ...            
  95000             11100.0
  100000            11700.0
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise11_06 {

    public static void main(String[] args) {
        System.out.printf("  %-20sCommission\n============================="
                + "======\n", 
                "Sales Amount");
        
        for(int salesAmount = 10000; salesAmount <= 100000; 
                salesAmount += 5000) 
            System.out.printf("  %-20d%.1f\n", salesAmount, 
                    computeCommission((double)salesAmount));
        
    }
    
    public static double computeCommission(double salesAmount) {
        double amount = 0.01;  // Initialize the sales amount
        double commission = 0;  // Initialize the commission needed
        
        while(amount < salesAmount) {
            amount += 0.01;
            if(amount > 10000.01)
                commission = (amount - 10000) * 0.12 + 5000 * 0.10 + 
                        5000 * 0.08;
            else if(amount > 5000.01)
                commission = (amount - 5000) * 0.10 + 5000 * 0.08;
            else 
                commission = amount * 0.08;
        }
        
        return commission;
    }    
}
