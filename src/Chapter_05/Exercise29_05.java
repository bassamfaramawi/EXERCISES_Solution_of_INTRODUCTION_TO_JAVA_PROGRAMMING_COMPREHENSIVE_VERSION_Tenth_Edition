/*
 **5.29 (Display calendars) Write a program that prompts the user to enter the 
 year and first day of the year and displays the calendar table for the year on 
 the console. For example, if the user entered the year 2013, and 2 for Tuesday, 
 January 1, 2013, your program should display the calendar for each month in the 
 year, as follows:

                       January 2013
          _________________________________________
          Sun    Mon   Tue   Wed   Thu    Fri   Sat
                 1     2     3     4      5  
          6      7     8     9     10     11    12
          13     14    15    16    17     18    19
          20     21    22    23    24     25    26
          27     28    29    30    31
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise29_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Prompt the user to enter the first day of year
        System.out.print("Enter first day of the year (0 for Sunday, "
                + " .. , 6 for Saturday): ");
        int firstDay = input.nextInt();
        
        String monthName = "";  // Initialize month name
        int monthDays = 0;  // Initialize the number of month days
        
        for(int n = 1; n <= 12; n++) {
            switch(n)  {
                case 1: monthName = "January";
                        monthDays = 31;
                        break;
                case 2: monthName = "February";
                        monthDays = (year % 400 == 0 
                                || (year % 4 == 0 
                                && year % 100 != 0) 
                                ? 29 : 28);
                        break;
                case 3: monthName = "March";
                        monthDays = 31;
                        break;
                case 5: monthName = "May";
                        monthDays = 31;
                        break;
                case 7: monthName = "July";
                        monthDays = 31;
                        break;
                case 8: monthName = "August";
                        monthDays = 31;
                        break;
                case 10: monthName = "October";
                         monthDays = 31;
                         break;
                case 12: monthName = "December";
                         monthDays = 31;
                         break;
                case 4: monthName = "April";
                        monthDays = 30;
                        break;
                case 6: monthName = "June";
                        monthDays = 30;
                        break;
                case 9: monthName = "September";
                        monthDays = 30;
                        break;
                case 11: monthName = "November";
                        monthDays = 30;
            }
            
            // Print the header
            System.out.printf("\n\n\n                 " + monthName + " " + year 
                    + "\n____________________________________________________\n"
                    + "%-8s%-8s%-8s%-8s%-8s%-8s%-8s\n", "Sun", "Mon", "Tue", "Wed",
                    "Thu", "Fri", "Sat");
            
            for(int i = 0; i < firstDay; i++)
                System.out.printf("%8s", "");
            
            // Print the body of the month
            for(int i = 1; i <= monthDays; i++)
                System.out.printf("%-8d"+ ((i + firstDay) % 7 == 0 ? "\n": ""), i);
            
            // Shift to the first day of the next month
            firstDay = (firstDay + monthDays) % 7; 
        }   
    }
    
}
