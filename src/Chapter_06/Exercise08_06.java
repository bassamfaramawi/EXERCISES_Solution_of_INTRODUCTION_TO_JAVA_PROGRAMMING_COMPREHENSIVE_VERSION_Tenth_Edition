/*
 6.8 (Conversions between Celsius and Fahrenheit) Write a class that contains 
the following two methods:
/** Convert from Celsius to Fahrenheit
public static double celsiusToFahrenheit(double celsius)
/** Convert from Fahrenheit to Celsius
public static double fahrenheitToCelsius(double fahrenheit)
The formula for the conversion is:
fahrenheit = (9.0 / 5) * celsius + 32
celsius = (5.0 / 9) * (fahrenheit – 32)

Write a test program that invokes these methods to display the following tables:
Celsius Fahrenheit | Fahrenheit Celsius
40.0    104.0      | 120.0      48.89
39.0    102.2      | 110.0      43.33
...
32.0    89.6       | 40.0       4.44
31.0    87.8       | 30.0       -1.11
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise08_06 {

   public static void main(String[] args) {
       System.out.printf("%12s%12s%5s%12s%12s\n", "Celsius", "Fahrenheit", "|", 
               "Fahrenheit", "Celsius");
       double celsius = 40,
               fahrenheit = 120;
       for(int i = 40; i > 30; i--) {
           System.out.printf("%12.1f%12.1f%5s%12.1f%12.2f\n", celsius, 
                   celsiusToFahrenheit(celsius), "|", fahrenheit, 
                   fahrenheitToCelsius(fahrenheit));
           celsius --;
           fahrenheit -= 10;
       }
    }
    
   // Convert from Celsius to Fahrenheit
   public static double celsiusToFahrenheit(double celsius) {
       return (9.0 / 5) * celsius + 32;
   }
   
   // Convert from Fahrenheit to Celsius
   public static double fahrenheitToCelsius(double fahrenheit) {
       return (5.0 / 9) * (fahrenheit - 32);
   }
}
