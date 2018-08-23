/*
 3.16 (Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.
 */
package chapter_03;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */

public class Exercise16_03 {

    public static void main(String[] args) {
        // Generate random coordinates inside the rectangle
        int randomX = (int)(Math.random() * 100 - 50),
                randomY = (int)(Math.random() * 200 - 100);
        
        //display the result
        System.out.print("The random point coordinate is (" + randomX + ", " + 
                randomY + ")");
    }
    
}
