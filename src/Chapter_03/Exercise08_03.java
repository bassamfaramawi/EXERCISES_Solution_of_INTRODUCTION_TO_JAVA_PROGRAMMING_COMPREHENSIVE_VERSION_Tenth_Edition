/*
 *3.8 (Sort three integers) Write a program that prompts the user to enter three 
integers and display the integers in non-decreasing order.
 */
package Chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise08_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter  integers
        System.out.print("Enter 3 integers: ");
        
        // Receive values
        int num1 = input.nextInt(),
                num2 = input.nextInt(),
                num3 = input.nextInt(),
               temp;
        
        // Make the necessary changes
        if(num1 > num2) {temp = num1;  num1 = num2;  num2 = temp;}
        if(num2 > num3) {temp = num2;  num2 = num3;  num3 = temp;}
        if(num1 > num2) {temp = num1;  num1 = num2;  num2 = temp;}
        
        // Display the results
        System.out.print("The integers in non-decreasing order: ");
        System.out.print(num1 + " " + num2 + " " + num3);
    }
    
}
