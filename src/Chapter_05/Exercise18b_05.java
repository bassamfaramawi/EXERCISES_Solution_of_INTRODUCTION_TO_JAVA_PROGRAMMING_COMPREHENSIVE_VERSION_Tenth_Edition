/*
  *5.18 (Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:

        Pattern B 
        1 2 3 4 5 6
        1 2 3 4 5 
        1 2 3 4
        1 2 3 
        1 2 
        1
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
public class Exercise18b_05 {

    public static void main(String[] args) {
        System.out.println("Pattern B");
        
        for(int n = 6; n >= 1; n--) { // A for loop for printing the pattern
            for(int k = 6 - n + 1; k <= 6; k++) 
                System.out.print(k + " ");
            
            System.out.println();
        }
    }
    
}
