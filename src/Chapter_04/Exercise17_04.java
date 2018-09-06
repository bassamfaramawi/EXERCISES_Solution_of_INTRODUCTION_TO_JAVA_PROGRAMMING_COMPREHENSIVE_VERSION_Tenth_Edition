/*
*4.17 (Days of a month) Write a program that prompts the user to enter a year and 
the first three letters of a month name (with the first letter in uppercase) and 
displays the number of days in the month.
 */
package Chapter_04;

import java.util.Scanner;   // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise17_04 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); //Create a Scanner object
        
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        
        int year = input.nextInt();
        
        // Prompt the user to enter a month
        System.out.print("Enter a month: ");
        
        String month = input.next();
        
        // Determine if a the year is leap or not 
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Display the results
        System.out.print(month + " " + year + " has " );
        switch(month) {
            case "Jan" : 
            case "Mar" : 
            case "May" : 
            case "Jul" : 
            case "Aug" : 
            case "Oct" : 
            case "Dec" : System.out.print( 31 + " days");
                          break;
            case "Apr" : 
            case "Jun" : 
            case "Sep" : 
            case "Nov" : System.out.print( 30 + " days");
                          break;
            case "Feb" : System.out.print( leapYear ? 29 : 28 + " days");
                          break;
        }
    }
    
}
