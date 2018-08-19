/*
 *3.5 (Find future dates) Write a program that prompts the user to enter an 
integer fo today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday 
is 6). Also prompt the user to enter the number of days after today for a future 
day and display the future day of the week.
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise05_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;  //Create Scanner object
        //Prompt the user to enter today's day
        System.out.print("Enter today's day: "); 
        // Receive value
        int today = input.nextInt();
        
        if(today >= 0 && today < 7){
            //Prompt the user to enter the number of days elapsed since today
            System.out.print("Enter the number of days elapsed since today: "); 
            // Receive value
            int elapsed = input.nextInt();
            
            switch(today)  {
                case 1: System.out.print("Today is Sunday");
                        break;
                case 2: System.out.print("Today is Monday");
                        break;
                case 3: System.out.print("Today is Tuesday");
                        break;
                case 4: System.out.print("Today is Wednesday");
                        break;
                case 5: System.out.print("Today is Thursday");
                        break;
                case 6: System.out.print("Today is Friday");
                        break;
                case 7: System.out.print("Today is Saturday");
                        break;
            }
        
        
            //Compute the future day
            int future = (today + elapsed) % 7;
            switch(future)  {
                case 1: System.out.print(" and the future day is Sunday");
                        break;
                case 2: System.out.print(" and the future day is Monday");
                        break;
                case 3: System.out.print(" and the future day is Tuesday");
                        break;
                case 4: System.out.print(" and the future day is Wednesday");
                        break;
                case 5: System.out.print(" and the future day is Thursday");
                        break;
                case 6: System.out.print(" and the future day is Friday");
                        break;
                case 7: System.out.print(" and the future day is Saturday");
                        break;
            }
        }
        else {
            System.out.print("Invalid day number");
        }
        
    }
    
}
