/*
 **5.28 (Display the first days of each month) Write a program that prompts the 
user to enter the year and first day of the year, and displays the first day of 
each month in the year. For example, if the user entered the year 2013, and 2 for 
Tuesday, January 1, 2013, your program should display the following output:

     January 1, 2013 is Tuesday
     ...
     December 1, 2013 is Sunday
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise28_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Prompt the user to enter the first day of year
        System.out.print("Enter first day of the year (0 for Sunday, "
                + " .. , 6 for Saturday): ");
        int firstDay = input.nextInt();
        
        String dayOfWeek = "";  // Initialize day of week name
        String monthName = "";  // Initialize month name
        int monthDays = 0;  // Initialize the number of month days
        
        System.out.println("Year months first days:");
        
        for(int n = 1; n <= 12; n++) {
            switch(n)  {
                case 1: monthName = "Janeury";
                        monthDays = 31;
                        break;
                case 2: monthName = "February";
                        monthDays = (year % 400 == 0 || (year % 4 == 0 
                                && year % 100 != 0) ? 29 : 28);
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
            
            switch(firstDay) {
                case 0: dayOfWeek = "Sunday";
                        break;
                case 1: dayOfWeek = "Monday";
                        break;
                case 2: dayOfWeek = "Tuesday";
                        break;
                case 3: dayOfWeek = "Wednesday";
                        break;
                case 4: dayOfWeek = "Thursday";
                        break;
                case 5: dayOfWeek = "Friday";
                        break;
                case 6: dayOfWeek = "Saturday";
            }
            
            System.out.println(monthName + " 1, " + year + " is " + dayOfWeek);
            firstDay = (firstDay + monthDays) % 7; // Shift to firsst day of next month
        }
    }
    
}
