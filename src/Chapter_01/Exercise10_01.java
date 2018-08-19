/*
 *1.10 (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes 
and 30 seconds. Write a program that displays the average speed in miles per hour. 
(Note that 1 mile is 1.6 kilometers.)
 */
package Chapter_01;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise10_01 {

    public static void main(String[] args) {
        //Compute and displays the average speed in miles per hour
        System.out.println("The average speed = " + ((14 / 1.6) / (( 45.0 / 60) + (30.0 /3600))) + " miles/hour");
    }
    
}
