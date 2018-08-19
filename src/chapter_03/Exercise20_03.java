/*
 *3.20 (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
to compute the wind-chill temperature. The formula is valid for temperatures in
the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether the temperature and/or wind speed is
invalid.
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise20_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        // Asking for entering input
        System.out.print("Enter the temperature in Fahrenheit between -58°F and "
                + "41°F: ");
        double ta = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();
        
        if (ta >= -58 && ta <= 41 && v >= 2) {
            // Calculate the values
            double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 
                    0.4275* ta* Math.pow(v, 0.16);
        
            // Print the result
            System.out.print("The wind chill index is " + 
                    (int)(twc * 100000) / 100000.0);
        }
        if(ta < -58 || ta > 41)    // Check the temperature range
            System.out.println("The temperature is invalid");
        if(v < 2)   // Check the wind speed range
            System.out.println("The wind speed is invalid");
        
        
    }
    
}
