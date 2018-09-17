/*
 **5.7 (Financial application: compute future tuition) Suppose that the tuition 
for a university is $10,000 this year and increases 5% every year. In one year, 
the tuition will be $10,500. Write a program that computes the tuition in ten 
years and the total cost of four years’ worth of tuition after the tenth year.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise07_05 {

    public static void main(String[] args) {
        final int NUMBER_OF_YEARS = 14;  // 10 Years + 4 years after it
        double tuition = 10_000;   // initialize tuition
        double increaseRate = 0.05;   // Every year incremint
        
        for(int n = 1; n <= NUMBER_OF_YEARS; n++) {
            tuition *= (1 + increaseRate);
            if(n == 10)  // Display the tuition after 10 years
                System.out.printf("The tuition after ten years is $%.2f\n", tuition);
        }
        
        // Display the total cost of 4 years after the tenth year
        System.out.printf("Total cost of 4 years after the tenth year: $%.2f", tuition);
    }
    
}
