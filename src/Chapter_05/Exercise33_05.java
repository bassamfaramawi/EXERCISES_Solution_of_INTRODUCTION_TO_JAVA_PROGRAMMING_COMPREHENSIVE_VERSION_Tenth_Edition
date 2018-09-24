/*
 **5.33 (Perfect number) A positive integer is called a perfect number if it is 
equal to the sum of all of its positive divisors, excluding itself. For example, 
6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 
+ 2 + 1. There are four perfect numbers less than 10,000. Write a program to find 
all these four numbers.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise33_05 {

    public static void main(String[] args) {
        int sum;
        
        System.out.print("The perfect numbers less than 10,000 are ");
        for(int n = 2; n <= 10000; n++) {
            sum = 0;
            for(int i = 1; i < n; i++) 
                sum = (n % i == 0 ? sum + i : sum);
            if(n == sum)
                System.out.print(n + " ");
        }
    }
    
}
