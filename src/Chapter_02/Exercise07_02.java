/*
 * *2.7 (Find the number of years) Write a program that prompts the user to 
    enter the minutes (e.g., 1 billion), and displays the number of years and 
    days for the minutes. For simplicity, assume a year has 365 days
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise07_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt(),
                years = minutes / (60 * 24 * 365),
                days = (minutes % 60 * 24 * 365) / (60 * 24);
        
        // Print the result
        System.out.print(minutes + " minutes is approximately " + years + 
                " years and " + days + " days");
    }
    
}
