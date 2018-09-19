/*
 **5.25 (Compute p) You can approximate p by using the following series:
pi = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + g + -1^(i + 1)/(2i - 1)
≤
Write a program that displays the pi value for i = 10000, 20000, …, and
100000.
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
public class Exercise25_05 {

    public static void main(String[] args) {
        
        for(int n = 10000; n <=  100000; n += 10000) {
            double PI,
                    sum = 0;
            
            System.out.print("PI for (n = " + n + "): ");
            
            for(int i = 0; i < n; i++)
                sum += (Math.pow(-1, i + 1) / (2 * i - 1));
            
            PI = 4 * sum;
            
            System.out.println(PI);
        }
    }
    
}
