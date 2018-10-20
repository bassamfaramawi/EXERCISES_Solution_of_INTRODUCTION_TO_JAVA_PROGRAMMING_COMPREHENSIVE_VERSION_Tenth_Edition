/*
 6.1 (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, 
. . . .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line.
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise01_06 {

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        
        for(int n = 1; n <= 100; n++) {
            System.out.print(getPentagonalNumber(n) + 
                    (n % NUMBERS_PER_LINE == 0 ? "\n" : " "));
            
        }
    }
    
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
    
}
