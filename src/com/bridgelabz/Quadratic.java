package com.bridgelabz;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        sc.close();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("The equation has no real roots.");
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root: " + root);
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        }
    }
}