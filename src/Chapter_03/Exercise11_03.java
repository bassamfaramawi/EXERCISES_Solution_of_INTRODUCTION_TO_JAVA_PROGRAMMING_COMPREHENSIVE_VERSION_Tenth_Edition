/*
 *3.11 (Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.
 */
package Chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise11_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter the month number
        System.out.print("Enter the month number: ");
        // Receive value
        int month = input.nextInt();
        //Prompt the user to the year
        System.out.print("Enter the year: ");
        // Receive value
        int year = input.nextInt();
        
        String monthName;
        int monthDays;
        // compute the day in month and display the results
        switch (month) {
            case 1: monthName = "January";
                    monthDays = 31;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 2: monthName = "February";
                    if(((year % 4 == 0) && (year % 100 != 0) || 
                            year % 400 == 0) && month == 2)
                    monthDays = 29;
                    else monthDays = 28;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 3: monthName = "March";
                    monthDays = 31;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 4: monthName = "April";
                    monthDays = 30;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 5: monthName = "May";
                    monthDays = 31;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 6: monthName = "June";
                    monthDays = 30;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 7: monthName = "July";
                    monthDays = 31;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 8: monthName = "August";
                    monthDays = 31;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 9: monthName = "September";
                    monthDays = 30;
                    System.out.print(monthName + " " + year + " had " + 
                            monthDays + " days");
                    break;
            case 10: monthName = "Otober";
                     monthDays = 31;
                     System.out.print(monthName + " " + year + " had " + 
                             monthDays + " days");
                     break;
            case 11: monthName = "November";
                     monthDays = 30;
                     System.out.print(monthName + " " + year + " had " + 
                             monthDays + " days");
                     break;
            case 12: monthName = "December";
                     monthDays = 31;
                     System.out.print(monthName + " " + year + " had " + 
                             monthDays + " days");
                     break;
            default: System.out.print("Invalid month number.");
        }
            
    
    }
    
}
