/*
 *1.8 (Area and perimeter of a circle) Write a program that displays the area 
and perimeter of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * p
area = radius * radius * p
 */
package Chapter_01;

/**
 *
 * @author BASSAM FARAMAWI
 * @since 2018
 */
public class Exercise08_01 {

    public static void main(String[] args) {
        
        //Compute and print perimeter
        System.out.println("perimeter(5.5 radius) = " + (2 * 5.5 * Math.PI));
        //Compute and print area
        System.out.println("area(5.5 radius) = " + (5.5 * 5.5 * Math.PI));
    }
    
}
