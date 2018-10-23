/*
 6.9 (Conversions between feet and meters) Write a class that contains the 
following two methods:
/** Convert from feet to meters
public static double footToMeter(double foot)
/** Convert from meters to feet
public static double meterToFoot(double meter)
The formula for the conversion is:
meter = 0.305 * foot
foot = 3.279 * meter
Write a test program that invokes these methods to display the following tables:

Feet    Meters   |    Meters    Feet
1.0     0.305    |    20.0      65.574
2.0     0.610    |    25.0      81.967
...              
9.0     2.745    |    60.0      196.721
10.0    3.050    |    65.0      213.115
*/
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise09_06 {

    public static void main(String[] args) {
        System.out.printf("%12s%12s%5s%12s%12s\n", "Feet", "Meters", "|", 
               "Meters", "Feet");
       double feet = 1,
               meters = 20;
       for(int i = 1; i <= 10; i++) {
           System.out.printf("%12.1f%12.3f%5s%12.1f%12.3f\n", feet, 
                   footToMeter(feet), "|", meters, 
                   meterToFoot(meters));
           feet++;
           meters += 5;
       }
    }
    
    // Convert from feet to meters
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    
    // Convert from meters to feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

}
