/*
 * 3.2 (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, 
generates two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise02_03 {

   public static void main(String[] args) {
       // Generate the three single digit numbers
        int number1 = (int)(System.currentTimeMillis() % 10),
                number2 = (int)(System.currentTimeMillis() / 7 % 10),
                number3 = (int)(System.currentTimeMillis() / 2 % 10);
        
        Scanner input = new Scanner(System.in);  //Create Scanner object
        System.out.print("What is " + number1 + " + " + number2 + " + " + 
                number3 + "? "); // Ask the user
        
        int answer = input.nextInt(); // Receive the answer
        // Print if thee answer is correct
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + 
                answer + " is " + (number1 + number2 == answer));
   }
}
