/*
 *4.24 (Order three cities) Write a program that prompts the user to enter three 
cities and displays them in ascending order.
 */
package Chapter_04;

import java.util.Scanner;  // Create a Scanner object

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise24_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        // Prompt the user to enter the first city
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        
        // Prompt the user to enter the seconed city
        System.out.print("Enter the seconed city: ");
        String city2 = input.nextLine();
        
        // Prompt the user to enter the third city
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        
        String temp;
        
        // Reorder the 3 cities
        if(city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        
        if(city2.compareTo(city3) > 0) {
            temp = city2;
            city2 = city3;
            city3 = temp;
        }
        
        if(city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        
        // Display the result
        System.out.print("The three cities in alphabetical order are " + city1 
                + " " + city2 + " " + city3);
    }
    
}
