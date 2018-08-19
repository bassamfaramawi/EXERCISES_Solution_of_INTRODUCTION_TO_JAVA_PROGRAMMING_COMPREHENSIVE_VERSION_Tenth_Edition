/*
 **3.24 (Game: pick a card) Write a program that simulates picking a card from a 
deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 
9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise24_03 { 

    public static void main(String[] args) {
        // Randomly generate the card rank number
        int rank = (int)(Math.random() * 13 + 1);
        
        // Randomly generate the card suit number
        int suit = (int)(Math.random() * 4 + 1);
        
        // Initialize rank & suit Names
        String rankName = "",
                suitName =  "";
        
        // Assign rank Name based on rank number generated
        switch(rank) {
            case 1: rankName = "Ace"; break;
            case 2: rankName = "2"; break;
            case 3: rankName = "3"; break;
            case 4: rankName = "4"; break;
            case 5: rankName = "5"; break;
            case 6: rankName = "6"; break;
            case 7: rankName = "7"; break;
            case 8: rankName = "8"; break;
            case 9: rankName = "9"; break;
            case 10: rankName = "10"; break;
            case 11: rankName = "Jack"; break;
            case 12: rankName = "Queen"; break;
            case 13: rankName = "King";
        }
        
        // Assign suit name based on suit number generated
        switch(suit) {
            case 1: suitName = "Clubs"; break;
            case 2: suitName = "Diamonds"; break;
            case 3: suitName = "Hearts"; break;
            case 4: suitName = "Spades";
        }
        
        // Display the result
        System.out.print("The card you picked is " + rankName + " of " + suitName);
    }
    
}
