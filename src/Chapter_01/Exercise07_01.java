/*
1.7 (Approximatep) p can be computed using the following formula:
p = 4 * ¢1 -13 + 1 5 -1 7 + 1 9 - 1 11 + c≤
Write a program that displays the result of 4 * ¢1 -
1 3 + 1 5 - 1 7 + 1 9 - 1 11 ≤ and 4 * ¢1 -13 +15 -17 + 19 -1 11 +113 ≤. 
Use 1.0 instead of 1 in your program
*/

package Chapter_01;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise07_01 {

    public static void main(String[] args) {
        
        //Compute then display the result
        System.out.println("4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))"
                + " = " + 
                (4 *(1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11)));
        System.out.println("4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + "
                + "(1/13)  = " + 
                (4 *(1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13)));
    }
    
}
