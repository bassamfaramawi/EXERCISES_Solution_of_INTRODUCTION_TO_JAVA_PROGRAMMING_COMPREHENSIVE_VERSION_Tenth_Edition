/*
 5.40 (Simulation: heads or tails) Write a program that simulates flipping a coin 
one million times and displays the number of heads and tails.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise40_05 {

    public static void main(String[] args) {
        int heads = 0;  // Initialize the number of heads
        int tails = 0;  // Initialize the number of tails
        
        int  flip;
        
        for(int n = 0; n < 1E6; n++)  {
            // Randomly generate 0 for a head or 1 for a tail
            flip = (int)(Math.random() + 0.5);  
            
            if(flip == 0) heads++;
            else tails++;
        }
        
        // Display the results
        System.out.println("When flippin a coin one milion times, the number of :"
        + "\nHeads = " + heads + "\nTails = " + tails);
    }
    
}
