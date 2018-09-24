/*
 ***5.34 (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program 
that plays the scissor-rock-paper game. Revise the program to let the user 
continuously play until either the user or the computer wins more than two times 
than its opponent.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise34_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        int computerWinings = 0;
        int userWinings = 0;
        
        System.out.println("The target score is 2, lets start the game\n");
        
        do{
            int computerChoise = (int)(Math.random() * 3);
        
            //Prompt the user to enter to enter a number 0, 1, or 2
            System.out.print("\nscissor (0), rock (1), paper (2): ");
            
            int userChoise = input.nextInt();  // Receive the value
            
            String guessName ="",
                    computerName = " ";   // Initialize guess and computer names
            
            switch(computerChoise) {  // Assign computer names
                case 0: computerName = "scissor";
                        break;
                case 1: computerName = "rock";
                        break;
                case 2: computerName = "paper";
                        break;
            }
            
            switch(userChoise) {  // Assign user guess names
                case 0: guessName = "scissor";
                        break;
                case 1: guessName = "rock";
                        break;
                case 2: guessName = "paper";
                        break;
            }
            
            // Check won or draw or lose and display the result
            if(userChoise == computerChoise)
                System.out.println("The computer is " + computerName + ". You are " 
                        + guessName + " too. It is a draw");
            else if((computerChoise == 0 && userChoise == 2) ||
                    (computerChoise == 1 && userChoise == 0) ||
                    (computerChoise == 2 && userChoise == 1) ) {
                System.out.println("The computer is " + computerName + ". You are " 
                        + guessName + ". You lose");
                computerWinings++;
            }
            else if((computerChoise == 2 && userChoise == 0) ||
                    (computerChoise == 0 && userChoise == 1) ||
                    (computerChoise == 1 && userChoise == 2) ) {
                System.out.println("The computer is " + computerName + ". You are " 
                        + guessName + ". You won");
                userWinings++;
            }
            
        }while(Math.abs(computerWinings - userWinings) < 2);
        
        // Print the winner
        System.out.print("\n" + (userWinings > computerWinings ? "You are " : 
                " The computer is ") + "the winner.");
    }
    
}
