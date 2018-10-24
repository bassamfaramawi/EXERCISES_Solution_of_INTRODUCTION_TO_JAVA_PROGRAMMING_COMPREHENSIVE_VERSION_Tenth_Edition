/*
 6.12 (Display characters) Write a method that prints characters using the 
following header:
public static void printChars(char ch1, char ch2, int numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers
per line. Write a test program that prints ten characters per line from 1 to Z.
Characters are separated by exactly one space.
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise12_06 {

    public static void main(String[] args) {
        System.out.println("The characters between '1' and 'Z' (10 per line):");
        printChars('1', 'Z', 10);
    }
    
    
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        char ch = (char)((int)ch1 + 1);  // Initialize the first character
        
        while(ch < ch2) {
            System.out.print(ch + ((ch - ch1) % numberPerLine == 0 ? 
                    "\n" : " "));
            ch++;
        }
    }
}
