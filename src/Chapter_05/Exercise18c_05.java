/*
*5.18 (Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:

            Pattern C
                      1 
                    2 1
                  3 2 1
                4 3 2 1
              5 4 3 2 1
            6 5 4 3 2 1 
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
public class Exercise18c_05 {

    public static void main(String[] args) {
        System.out.println("Pattern C");
        
        for(int n = 1; n <= 6; n++) { // A for loop for printing the pattern
            for(int k = 6; k >= 1; k--) 
                System.out.print((k > n ? "  " : k + " "));
            
            System.out.println();
        }
    }
    
}
