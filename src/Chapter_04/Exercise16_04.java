/*
 4.16 (Random character) Write a program that displays a random uppercase letter
using the Math.random() method.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise16_04 {

    public static void main(String[] args) {
        // Generate character between 'A' and 'Z'
        char random = (char)((int)(Math.random() * ((int)'Z' - (int)'A')) + (int)'A');
        
        // Display the result
        System.out.print("The generated character is " + random);
    }
    
}
