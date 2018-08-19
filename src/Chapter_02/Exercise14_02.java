/*
 * *2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure 
    of health on weight. It can be calculated by taking your weight in kilograms 
    and dividing by the square of your height in meters. Write a program that 
    prompts the user to enter a weight in pounds and height in inches and displays 
    the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254 
    meters.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 * @since 2018
 */
public class Exercise14_02 {

    public static void main(String[] args) {
        // Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;
        System.out.print("Enter height in inchss: ");
        double height = input.nextDouble() * 0.0254;
        
        // Print the result
        System.out.print("BMI is " + (int)(weight / (height * height) * 
                10000) / 10000.0);
    }
    
}
