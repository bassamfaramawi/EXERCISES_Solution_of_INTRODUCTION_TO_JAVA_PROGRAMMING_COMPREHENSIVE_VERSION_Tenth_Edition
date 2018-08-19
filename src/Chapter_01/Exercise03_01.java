/*
 *1.3 (Display a pattern) Write a program that displays the following pattern:
J A V V A
J A A V V A A
J J AAAAA V V AAAAA
J J A A V A A
 */
package Chapter_01;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise03_01 {

    public static void main(String[] args) {
        
        //Display the pattern
        System.out.printf("%4s%5s%5s%6s%4s%s", "J", "A", "V", "V", "A", "\n");
        System.out.printf("%4s%6s%5s%4s%6s%s", "J", "A A", "V", "V", "A A", "\n");
        System.out.printf("%4s%7s%7s%8s%s", "J  J", "AAAAA","V V", "AAAAA", "\n");
        System.out.printf("%3s%3s%6s%5s%4s%6s", "J J", "A", "A", "V", "A", "A");
        
    }
    
}
