/*
 **5.27 (Display leap years) Write a program that displays all the leap years, 
ten per line, from 101 to 2100, separated by exactly one space. Also display the 
number of leap years in this period.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise27_05 {

    public static void main(String[] args) {
        
        final int NUMBERS_PER_LINE = 10;  // Years per one line
        int count = 0;
        
        System.out.println("The leap years between 101 and 2100:");
        
        for(int n = 101; n <= 2100; n++) 
            if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
                count++;
                System.out.print(n + (count % NUMBERS_PER_LINE == 0 ? "\n" : " "));
            }
        
    }
    
}
