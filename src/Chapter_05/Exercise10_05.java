/*
5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the 
numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers 
are separated by exactly one space.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise10_05 {

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10; // Constant numbers per line
        final int START_NUMBER = 100; // From the number
        final int END_NUMBER = 1000; // To the number
        int count = 0;  // The count of numbers divisible by 5 & 6
        
        System.out.println("The numbers divisible by 5 & 6 from " + START_NUMBER 
                + " to " + END_NUMBER + " is:");
        
        for(int n = START_NUMBER; n <= END_NUMBER; n++)
            if(n % 5 == 0 && n % 6 == 0) {
                count ++;
                // Display 10 number per line
                System.out.print(n + " " + (count % NUMBERS_PER_LINE == 0 ? "\n" : ""));
            }
    }
    
}
