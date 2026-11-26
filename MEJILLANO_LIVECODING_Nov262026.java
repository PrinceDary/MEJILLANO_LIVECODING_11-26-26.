/*
- Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
- Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejillano_livecoding_nov26.pkg2026;

import java.util.Scanner;

/**
 *
 * - @author MEJILLANO_CPE113
 */
public class MEJILLANO_LIVECODING_Nov262026 {

    /**
     * - @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input for Point A
        System.out.print("Enter x for Point A: ");
        double xA = scanner.nextDouble();
        System.out.print("Enter y for Point A: ");
        double yA = scanner.nextDouble();
        EngineeringPoint pA = new EngineeringPoint(xA, yA); // Create Point A

        // Input for Point B
        System.out.print("Enter x for Point B: ");
        double xB = scanner.nextDouble();
        System.out.print("Enter y for Point B: ");
        double yB = scanner.nextDouble();
        EngineeringPoint pB = new EngineeringPoint(xB, yB); // Create Point B

        // Input for Point C
        System.out.print("Enter x for Point C: ");
        double xC = scanner.nextDouble();
        System.out.print("Enter y for Point C: ");
        double yC = scanner.nextDouble();
        EngineeringPoint pC = new EngineeringPoint(xC, yC); // Create Point C

        System.out.println();

        // Analyze initial points
        analyzePoints("Point A", pA, "Point B", pB);
        analyzePoints("Point A", pA, "Point C", pC);

        // Update Point C using Scanner
        System.out.print("Enter new x for Point C: ");
        pC.setX(scanner.nextDouble()); // Set new X
        System.out.print("Enter new y for Point C: ");
        pC.setY(scanner.nextDouble()); // Set new Y

        System.out.println();

        // Analyze updated points
        analyzePoints("Point B", pB, "Point C (Updated)", pC);

        scanner.close();
    }

    // Calculates and prints distance and slope between two points
    public static void analyzePoints(String name1, EngineeringPoint p1, String name2, EngineeringPoint p2) {
        System.out.println("===== ENGINEERING DISTANCE AND SLOPE ANALYZER =====");
        // Display coordinates
        System.out.println(name1 + ": (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println(name2 + ": (" + p2.getX() + ", " + p2.getY() + ")");

        // Compute and print distance
        double distance = p1.calculateDistance(p2);
        System.out.println("Distance: " + distance + " units");

        // Compute and print slope, handling vertical lines
        try {
            double slope = p1.calculateSlope(p2);
            System.out.println("Slope: " + slope);
        } catch (ArithmeticException e) {
            System.out.println("Slope: " + e.getMessage()); // Print undefined slope error
        }
        System.out.println();
    }
}
