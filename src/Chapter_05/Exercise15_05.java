/*
 *5.15 (Display the ASCII character table) Write a program that prints the characters 
in the ASCII character table from ! to ~. Display ten characters per line. The ASCII
table is shown in Appendix B. Characters are separated by exactly one space.
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
public class Exercise15_05 {

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;  // Constant numbers per line
        int startASCII = (int)'!'; // From the number
        int endASCII = (int)'~';  // To the number
        
        System.out.println("The ASCII table from ! to ~:");
        
        for(int n = startASCII; n <= endASCII; n++)  {
            // Display the result
            System.out.print((char)n + ((n - startASCII + 1) % NUMBERS_PER_LINE == 0 ? "\n" : " "));
        }
    }
    
}
