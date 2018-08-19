/*
 * 2.4 (Convert pounds into kilograms) Write a program that converts pounds into
kilograms. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
 */
package Chapter_02;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise04_02 {

    public static void main(String[] args) {
        //Create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Asking for entering input
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble(),
                kilograms;
        
        // Print the result
        System.out.print(pounds + " pounds is " + (kilograms = pounds * 0.454) + 
                (kilograms > 1 ?  " kilograms" : " kilogram"));
    }
    
}
