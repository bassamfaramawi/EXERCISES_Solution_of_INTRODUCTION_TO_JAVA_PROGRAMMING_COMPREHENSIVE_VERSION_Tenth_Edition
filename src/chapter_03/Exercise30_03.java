/*
 *3.30 (Current time) Revise Programming Exercise 2.8 to display the hour using 
        a 12-hour clock.
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise30_03 {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the time zone offset to GMT: ");
        int GMT_Offset = input.nextInt();
        
        // Calculate the values
        long totalMiliSeconeds = System.currentTimeMillis(),
                totalSeconds = totalMiliSeconeds / 1000 + GMT_Offset * 3600,
                hours = ((totalSeconds / 3600) % 24),
                minutes = (totalSeconds %= 3600) / 60,
                seconds = totalSeconds % 60;
        
        // Print the result
        System.out.print("The current time is " + 
                // Display the hour using a 12-hour clock
                (hours > 12 ? hours - 12 : hours) 
                + ":" + minutes + ":" + seconds);
    }
    
}
