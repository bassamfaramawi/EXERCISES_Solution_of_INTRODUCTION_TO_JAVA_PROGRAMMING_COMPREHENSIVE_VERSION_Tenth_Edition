/*
 *6.10 (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise10_06 {

    public static void main(String[] args) {
        int number = 1;
        int count = 1;
        
        while(number++ < 10000) 
            if(isPrime(number))
                System.out.print(number + (count++ % 10 ==0 ? "\n" : " "));
    }
    
    
    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }
}
