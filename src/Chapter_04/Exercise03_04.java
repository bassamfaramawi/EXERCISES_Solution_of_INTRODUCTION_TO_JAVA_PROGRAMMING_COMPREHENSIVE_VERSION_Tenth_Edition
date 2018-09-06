/*
 *3.3 (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
         Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
         www.gps-data-team.com/map/ and compute the estimated area enclosed by 
         these four cities. (Hint: Use the formula in Programming Exercise 3.2 to 
         compute the distance between two cities. Divide the polygon into two 
         triangles and use the formula in Programming Exercise 2.19 to compute 
         the area of a triangle.)
 */
package Chapter_04;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */

public class Exercise03_04 {

    public static void main(String[] args) {
        final double EARTH_RADIUS = 6371.01;  // earth radius in Km as a constant

        // Atlanta, Georgia coordinates (latitude, longitude)
        double x1 = Math.toRadians(33.7489954),
                y1 = Math.toRadians(-84.3879824);
        
        // Orlando, Florida coordinates (latitude, longitude)
        double x2 = Math.toRadians(28.5383355),
                y2 = Math.toRadians(-81.37923649999999);
        
        // Savannah, Georgia coordinates (latitude, longitude)
        double x3 = Math.toRadians(32.0808989),
                y3 = Math.toRadians(-81.09120300000001);
        
        // Charlotte, North Carolina coordinates (latitude, longitude)
        double x4 = Math.toRadians(35.2270869),
                y4 = Math.toRadians(-80.84312669999997);
        
        // Compute the three sides of the first triangle of the polygon (Atlanta - Orlando - Savannah)
        double side1 = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + 
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        double side2 = EARTH_RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) + 
                        Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
        
        // The side between the 2 triangles
        double side3 = EARTH_RADIUS * Math.acos(Math.sin(x3) * Math.sin(x1) + 
                Math.cos(x3) * Math.cos(x1) * Math.cos(y3 - y1));
        
        // Compute s2
        double s1 = (side1 + side2 + side3) / 2;
        
        // Compute the area
        double area1 = Math.sqrt(2 * s1 * (s1 - side1) * (s1 - side2) * (s1 - side3));
        
        // compute the tow left sides of the second triangle of the polygon (Atlanta - Charlotte - Savannah)
        double side4 = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x4) + 
                Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));
        double side5 = EARTH_RADIUS * Math.acos(Math.sin(x4) * Math.sin(x3) + 
                Math.cos(x4) * Math.cos(x3) * Math.cos(y4 - y3));
        
        // Compute s2
        double s2 = (side4 + side5 + side3) / 2;
        
        // Compute the area
        double area2 = Math.sqrt(2 * s2 * (s2 - side4) * (s2 - side5) * (s2 - side3));
        
        double area = area1 + area2;  // the polygon hole area
        
        // Display the result
        System.out.print("The estimated area enclosed by these four cities(Atlanta"
                + " - Orlando - Savannah - Charlotte) is:" + area + "Km2");

    }
    
}
