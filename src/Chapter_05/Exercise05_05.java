/*
 5.5 (Conversion from kilograms to pounds and pounds to kilograms) Write a program
      that displays the following two tables side by side:
        Kilograms    Pounds     |     Pounds     Kilograms
        1            2.2        |     20         9.09
        3            2.2        |     25         11.36
        ...                          
        197          433.4      |     510        231.82
        199          437.8      |     515        234.09
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise05_05 {

    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAMS = 2.2;  // POUNDS_PER_KILOGRAMS
        
        System.out.printf("%-18s%-14s%-9s%-14s%-18s\n", "Kilograms", "Pounds", 
                "|", "Pounds", "Kilograms");  // Print the header
        
        // Loop for the table body
        for(int kilograms = 1, pounds = 20; kilograms < 200; 
                kilograms++, pounds += 5)  
            System.out.printf("%-18d%-14.1f%-9s%-14d%-18.2f\n", kilograms, 
                    kilograms * POUNDS_PER_KILOGRAMS, "|", pounds, 
                    pounds / POUNDS_PER_KILOGRAMS);
    }
    
}
