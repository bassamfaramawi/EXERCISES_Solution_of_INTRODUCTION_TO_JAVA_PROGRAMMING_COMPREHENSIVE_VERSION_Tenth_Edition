/*
 * 3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition question
with two integers less than 100.
 */
package Chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise10_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        // 1. Generate two random single-digit integers
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        
        // 2. Prompt the student to answer ”What is number1 + number2?”
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        
        // 3. Grade the answer and display the result
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 +
                    " should be " + (number1 + number2));
        }
        
    }
    
}
