/*
 *3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, 
to let the user enter weight, feet, and inches. For example, if a person is 5 
feet and 10 inches, you will enter 5 for feet and 10 for inches.
 */
package Chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();  // Receive value
        
        //Prompt the user to enter feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();    // Receive value
        
        //Prompt the user to enter inches
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();    // Receive value
        
        final double KILOGRAMS_PER_POUND = 0.45359237;   //Kilograms per pound
        final double METERS_PER_INCH = 0.0254;   //Meters per inch
        final double FEET_PER_METER = 3.280839895;   //Feet per meter
        
        // Pounds to kilograms
        double kilogrames = weight * KILOGRAMS_PER_POUND, 
                //(Feet + inches) to meters
                meters = (feet / FEET_PER_METER) + (inches * METERS_PER_INCH),
                // Calculate BMI
                BMI = kilogrames / (meters * meters);
        
        //Display the result
        System.out.println("BMI is " + BMI);
        
        if(BMI < 18.5)
            System.out.print("Underweight");
        else if(BMI < 25)
             System.out.print("Normal");
        else if(BMI < 30)
             System.out.print("Overweight");
        else 
             System.out.print("Obese");

    }
    
}
