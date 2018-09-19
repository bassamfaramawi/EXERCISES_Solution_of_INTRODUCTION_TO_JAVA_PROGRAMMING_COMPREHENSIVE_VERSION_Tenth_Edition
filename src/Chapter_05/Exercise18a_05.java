/*
 *5.18 (Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:

        Pattern A 
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5 
        1 2 3 4 5 6
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
public class Exercise18a_05 {

    public static void main(String[] args) {
        System.out.println("Pattern A");
        
        for(int n = 1; n <= 6; n++) { // A for loop for printing the pattern
            for(int k = 1; k <= n; k++) 
                System.out.print(k + " ");
            
            System.out.println();
        }
    }
    
}
