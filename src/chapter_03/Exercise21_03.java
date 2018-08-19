/*
 **3.21 (Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week. The formula is
h = (q + 26(m + 1)/10 + k +k/4 +j/4 + 5j) % 7
where
■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
Wednesday, 5: Thursday, 6: Friday).
■ q is the day of the m.
■ m is the m (3: March, 4: April, …, 12: December). January and February
are counted as months 13 and 14 of the previous year.
■ j is the century (i.e.,
year
100
).
■ k is the year of the century (i.e., year % 100).
Note that the division in the formula performs an integer division. Write a program
that prompts the user to enter a year, m, and day of the m, and
displays the name of the day of the week.
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise21_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        // Asking for entering year
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        
        // Asking for entering m
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        // Convert input from 1 to 13 and from 2 to 14
        switch(m) {case 1: m = 13; break;  case 2: m = 14;}
        
        // Asking for entering day of the m
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();        
        
        int j = year / 100;   // Compute the century
        
        int k = year % 100;   // Compute the year of the century
        
        // Calculate day of the week
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        // Diplay the result
        System.out.print("Day of the week is ");
        
        switch(h) {
            case 0: System.out.print("Saturday");
                    break;
            case 1: System.out.print("Sunday");
                    break;
            case 2: System.out.print("Monday");
                    break;
            case 3: System.out.print("Tuesday");
                    break;
            case 4: System.out.print("Wednesday");
                    break;
            case 5: System.out.print("Thursday");
                    break;
            case 6: System.out.print("Friday");
        }
        
    }
    
}
