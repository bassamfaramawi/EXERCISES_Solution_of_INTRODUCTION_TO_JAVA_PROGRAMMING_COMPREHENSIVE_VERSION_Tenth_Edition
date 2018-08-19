/*
 *3.17 (Game: scissor, rock, paper) Write a program that plays the popular 
scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, 
and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 
representing scissor, rock, and paper. The program prompts the user to enter a 
number 0, 1, or 2 and displays a message indicating whether the user or the 
computer wins, loses, or draws.
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise17_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        int computer = (int)(Math.random() * 3);
        
        //Prompt the user to enter to enter a number 0, 1, or 2
        System.out.print("scissor (0), rock (1), paper (2): ");
        
        int guess = input.nextInt();  // Recieve the value
        
        String guessName ="",
                computerName = " ";    // Initialize guess and computer names
        
        switch(computer) {  // Assign computer names
            case 0: computerName = "scissor";
                    break;
            case 1: computerName = "rock";
                    break;
            case 2: computerName = "paper";
                    break;
        }
        
        switch(guess) {  // Assign user guess names
            case 0: guessName = "scissor";
                    break;
            case 1: guessName = "rock";
                    break;
            case 2: guessName = "paper";
                    break;
        }
        
        // Check won or draw or lose and display the result
        if(guess == computer)
            System.out.print("The computer is " + computerName + ". You are " + 
                    guessName +" too. It is a draw");
        else if((computer == 0 && guess == 2) ||
                (computer == 1 && guess == 0) ||
                (computer == 2 && guess == 1) )
            System.out.print("The computer is " + computerName + ". You are " + 
                    guessName + ". You lose");
        else if((computer == 2 && guess == 0) ||
                (computer == 0 && guess == 1) ||
                (computer == 1 && guess == 2) )
            System.out.print("The computer is " + computerName + ". You are " + 
                    guessName + ". You won");
    }
    
}
