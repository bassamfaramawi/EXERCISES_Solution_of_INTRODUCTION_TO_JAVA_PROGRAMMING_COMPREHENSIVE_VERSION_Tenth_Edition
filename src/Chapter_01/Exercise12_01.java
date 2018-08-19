/*
 1.12 (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
 */
package Chapter_01;

/**
 *
 * @author BASSAM FARAMAWI
 */
public class Exercise12_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Compute the average speed then display results
        System.out.println("Average speed = " + (24 * 1.6 / (35.0 / 3600 + 
                40.0 / 60 + 1)) + " Km/hour");
    }
    
}
