/*
 5.4 (Conversion from miles to kilometers) Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):
        Miles     Kilometers
        1         1.609
        2         3.218
        ...       
        9         14.481
        10        16.090
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise04_05 {

    public static void main(String[] args) {
        final double KILOMETERS_PER_MILES = 1.609;  // KILOMETERS_PER_MILES
        
        System.out.printf("%-14s%-18s\n", "Miles", "Kilometers");  // Print the header
        
        for(int n = 1; n <= 10; n++)  // Loop for the table body
            System.out.printf("%-14d%-18.3f\n", n, n * KILOMETERS_PER_MILES);
    }
    
}
