/*
 3.14 (Game: heads or tails) Write a program that lets the user guess whether 
the flip of a coin results in heads or tails. The program randomly generates an 
integer 0 or 1, which represents head or tail. The program prompts the user to 
enter a guess and reports whether the guess is correct or incorrect.
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise14_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        int random = (int)(Math.random() + 0.5);
        //Prompt the user to enter to enter filing status
        System.out.print("guess whether the flip of a coin results in "
                + "a head or a tail, 0 for head and 1 for tail: ");
        //Recieve value
        int guess = input.nextInt();
        // Check the if the guess is correct and diplay the result
        System.out.print("Your guess is: " + (random == guess ? "Correct" : "incorrect"));
        
    }
    
}
