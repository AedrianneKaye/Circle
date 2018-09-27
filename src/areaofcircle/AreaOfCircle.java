/*
 * Aedrianne Malawis
 * AreaOfCircle.java
 * This program calculates the area of a circle of radius 15 cm
 * September 18, 2018
 */

package areaofcircle;

/**
 *
 * @author aemal4075
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area = 0.0;
        // algorithm for area calc
        area = pi * radius * radius;
        System.out.println("the area ..." + area + " cm squared");

        // TODO code application logic here
    }
    
}
