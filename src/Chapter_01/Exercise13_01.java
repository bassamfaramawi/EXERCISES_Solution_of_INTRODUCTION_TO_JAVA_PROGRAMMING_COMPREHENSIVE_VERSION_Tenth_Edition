/*
 * *1.13 (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to 
    solve the following 2 * 2 system of linear equation:
    ax + by = e
    cx + dy = f
    x = (ed - bf) / (ad - bc)
    y = (af - ec) / (ad - bc)
Write a program that solves the following equation and displays the value for x and y:
3.4x + 50.2y = 44.5
2.1x + .55y = 5.9
 */
package Chapter_01;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise13_01 {

    public static void main(String[] args) {
        //Display the equation
        System.out.println("3.4x + 50.2y = 44.5\n2.1x + .55y = 5.9");
        //Calculate and print the value of x
        System.out.println("x = " + ((44.5 * 0.55 - 50.2 * 5.9) / 
                (3.4 * 0.55 - 50.2 * 2.1)));
        //Calculate and print the value of y
        System.out.println("y = " + ((3.4 * 5.9 - 44.5 * 2.1) / 
                (3.4 * 0.55 - 50.2 * 2.1)));
    }
    
}
