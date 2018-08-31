/*
 **3.4 (Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month name January, February, …, December for
the number 1, 2, …, 12, accordingly.
 */
package Chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */

public class Exercise04_03 {

    public static void main(String[] args) {
        //Generate random number between 1 and 12
        int month = (int)(Math.random() * 12) + 1; 
        // View the month name
        System.out.print("The randomly generated month is ");
        switch(month) {
            case 1 : System.out.print("January");
                     break;
            case 2 : System.out.print("February");
                     break;
            case 3 : System.out.print("March");
                     break;
            case 4 : System.out.print("April");
                     break;
            case 5 : System.out.print("May");
                     break;
            case 6 : System.out.print("June");
                     break;
            case 7 : System.out.print("July");
                     break;
            case 8 : System.out.print("August");
                     break;
            case 9 : System.out.print("September");
                     break;
            case 10 : System.out.print("October");
                     break;
            case 11 : System.out.print("November");
                     break;
            case 12 : System.out.print("December");         
        }
    }
    
}
