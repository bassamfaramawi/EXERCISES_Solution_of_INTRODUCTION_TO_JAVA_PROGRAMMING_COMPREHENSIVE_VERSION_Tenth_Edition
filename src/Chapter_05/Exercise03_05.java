/*
 5.3 (Conversion from kilograms to pounds) Write a program that displays the following
table (note that 1 kilogram is 2.2 pounds):
        Kilograms     Pounds
        1               2.2
        3               6.6
        ...
        197           433.4
        199           437.8
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise03_05 {

    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAMS = 2.2;  // POUNDS_PER_KILOGRAMS
        
        System.out.printf("%-18s%14s\n", "Kilograms", "Pounds");  // Print the header
        
        for(int n = 1; n < 200; n += 2)  // Loop for the table body
            System.out.printf("%-18d%14.1f\n", n, n * POUNDS_PER_KILOGRAMS);
    }
    
}
