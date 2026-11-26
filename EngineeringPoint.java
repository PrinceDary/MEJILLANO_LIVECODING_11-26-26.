/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mejillano_livecoding_nov26.pkg2026;

/**
 *
 * @author MEJILLANO_CPE113
 */
public class EngineeringPoint { 
    
    private double x;
    private double y;

    public EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double calculateDistance(EngineeringPoint point) {
        double a = point.getX() - this.x;
        double b = point.getY() - this.y;
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double calculateSlope(EngineeringPoint point) {
        double a = point.getX() - this.x;
        if (a == 0) {
            throw new ArithmeticException("Undefined (vertical line: x-coordinates are equal)");
        }
        double b = point.getY() - this.y;
        return b / a;
    }
}

