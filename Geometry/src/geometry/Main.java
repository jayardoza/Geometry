/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        myPoint point1 = new geometry.myPoint(5, 10);
        myPoint point2 = new geometry.myPoint(8, 16);
        myPoint origin = new geometry.myPoint();

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
        System.out.println("Origin: " + origin);

        System.out.println("Distance from Point 1 to Point 2: " + 
                       String.format("%.2f", point1.distance(point2)));
        System.out.println("Distance from Point 1 to Origin: " + 
                       String.format("%.2f", point1.distanceToOrigin()));
                                
        System.out.println("Quadrant of Point 1: " + point1.getQuadrant());
        System.out.println("Quadrant of Point 2: " + point2.getQuadrant());
                                
        System.out.println("Angle of Point 1: " + String.format("%.2f", point1.getAngle()) + " degrees");
        System.out.println("Angle of Point 2: " + String.format("%.2f", point2.getAngle()) + " degrees");

    }
}
