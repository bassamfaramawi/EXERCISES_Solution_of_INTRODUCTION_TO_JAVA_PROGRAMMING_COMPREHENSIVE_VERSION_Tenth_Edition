/*
 * 1.4 (Print a table) Write a program that displays the following table:
   a a^2 a^3
   1 1 1
   2 4 8
   3 9 27
   4 16 64
 */
package Chapter_01;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise04_01 {

    public static void main(String[] args) {
        
        //Display the table
        System.out.printf("%2s%10s%10s%s", "a", "a^2", "a^3", "\n");
        System.out.printf("%2d%10d%10d%s", 1, 1, 1, "\n");
        System.out.printf("%2d%10d%10d%s", 2, 4, 8, "\n");
        System.out.printf("%2d%10d%10d%s", 3, 9, 27, "\n");
        System.out.printf("%2d%10d%10d", 4, 16, 64);
        
    }
    
}
