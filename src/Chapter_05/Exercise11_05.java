/*
 5.11 (Find numbers divisible by 5 or 6, but not both) Write a program that displays
all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise11_05 {

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10; // Constant numbers per line
        int startNumber = 100; // From the number
        int endNumber = 200; // To the number
        
        System.out.println("The numbers divisible by 5 or 6, but not both from " 
                + startNumber + " to " + endNumber + " is:");
        
        for(int n = startNumber; n <= endNumber; n++)
            if(n % 5 == 0 ^ n % 6 == 0) 
                // Display 10 number per line
                System.out.print(n + " " + 
                        ((n- startNumber + 1) % NUMBERS_PER_LINE == 0 ? "\n" : ""));
    }
    
}
