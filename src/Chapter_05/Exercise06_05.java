/*
 5.6 (Conversion from miles to kilometers) Write a program that displays the following
two tables side by side:
            Miles      Kilometers    |      Kilometers       Miles
            1          1.609         |      20               12.430
            2          3.218         |      25               15.538
            ...                                
            9          14.481        |      60               37.290
            10         16.090        |      65               40.398
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise06_05 {

    public static void main(String[] args) {
        final double KILOMETERS_PER_MILES = 1.609;  // KILOMETERS_PER_MILES
        
        System.out.printf("%-18s%-14s%-9s%-14s%-18s\n", "Miles", "Kilometers", 
                "|", "Kilometers", "Miles");  // Print the header
        
        // Loop for the table body
        for(int kilometers = 1, miles = 20; kilometers < 200; 
                kilometers++, miles += 5)  
            System.out.printf("%-18d%-14.1f%-9s%-14d%-18.2f\n", kilometers, 
                    kilometers * KILOMETERS_PER_MILES, "|", miles, 
                    miles / KILOMETERS_PER_MILES);
    }
    
}
