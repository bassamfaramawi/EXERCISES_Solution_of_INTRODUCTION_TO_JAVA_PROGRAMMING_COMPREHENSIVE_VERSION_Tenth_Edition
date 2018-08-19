/*
 * *2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that 
      displays the current time in GMT. Revise the program so that it prompts 
      the user to enter the time zone GMT_Offset to GMT and displays the time in the 
      specified time zone.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise08_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
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
        System.out.print("The current time is " + hours + ":" + minutes + ":" + 
                seconds);
    }
    
}
