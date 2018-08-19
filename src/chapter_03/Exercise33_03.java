/*
 *3.33 (Financial: compare costs) Suppose you shop for rice in two different 
packages. You would like to write a program to compare the cost. The program 
prompts the user to enter the weight and price of the each package and displays 
the one with the better price.
 */
package chapter_03;

import java.util.Scanner; // import the scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise33_03 {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Asking to enter weight and price for package 1:
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble(),
                price1 = input.nextDouble(),
                priceOfKg1 = price1 / weight1;
        
        // Asking to enter weight and price for package 2:
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble(),
                price2 = input.nextDouble(),
                priceOfKg2 = price2 / weight2;
        
        // Choose the cheapest price per kg
        if(priceOfKg1 < priceOfKg2)
            System.out.print("Package 1 has a better price.");
        else if(priceOfKg1 > priceOfKg2)
            System.out.print("Package 2 has a better price.");
        else
            System.out.print("Two packages have the same price.");
    }
    
}
