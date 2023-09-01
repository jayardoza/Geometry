/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;
import java.text.DecimalFormat;
/**
 *
 * @author User
 */

    
public class myPoint {
    private double x;
    private double y;

    public myPoint() {
        this(0, 0);
    }

    public myPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(myPoint point) {
        return distance(point.getX(), point.getY());
    }

    public double distanceToOrigin() {
        return distance(0, 0);
    }

    public void displayPoint() {
        System.out.printf("(%f,%f)%n", x, y);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.00");
        return "(" + format.format(x) + "," + format.format(y) + ")";
    }

    public int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else if (x == 0 && y != 0) {
            return 5;
        } else if (x != 0 && y == 0) {
            return 6;
        } else {
            return 0; 
        }
    }

    public double getAngle() {
        return Math.toDegrees(Math.atan2(y, x));
    }
}

