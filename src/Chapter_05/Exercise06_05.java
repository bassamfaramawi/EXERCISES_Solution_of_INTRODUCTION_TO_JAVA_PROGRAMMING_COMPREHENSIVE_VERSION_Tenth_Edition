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
        
        System.out.printf("%-12s%-12s%-9s%-12s%-12s\n", "Miles", "Kilometers", 
                "|", "Kilometers", "Miles");  // Print the header
        
        // Loop for the table body
        for(int miles = 1, kilometers = 20; miles <= 10; 
                miles++, kilometers += 5)  
            System.out.printf("%-12d%-12.3f%-9s%-12d%-12.3f\n", miles, 
                    miles * KILOMETERS_PER_MILES, "|", kilometers, 
                    kilometers / KILOMETERS_PER_MILES);
    }
    
}
