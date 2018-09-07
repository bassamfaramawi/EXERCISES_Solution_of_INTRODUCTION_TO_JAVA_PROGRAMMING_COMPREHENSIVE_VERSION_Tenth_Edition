/*
 *4.25 (Generate vehicle plate numbers) Assume a vehicle plate number consists 
of three uppercase letters followed by four digits. Write a program to generate 
a plate number.
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise25_04 {

    public static void main(String[] args) {
        // Generate letters
        char letter1 = (char)((int)(Math.random() * 26) + (int)'A'),
                letter2 = (char)((int)(Math.random() * 26) + (int)'A'),
                letter3 = (char)((int)(Math.random() * 26) + (int)'A');
        
        // Generate digits
        int digit1 = (int)(Math.random() * 10),
                digit2 = (int)(Math.random() * 10),
                digit3 = (int)(Math.random() * 10),
                digit4 = (int)(Math.random() * 10);
        
        // Conecate them and display the result
        System.out.print("" + letter1 + letter2 + letter3 + digit1 + digit2 + 
                digit3 + digit4);
    }
    
}
