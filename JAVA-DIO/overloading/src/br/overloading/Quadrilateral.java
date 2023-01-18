package br.overloading;

public class Quadrilateral {

    public static void area(double side) {

        System.out.println("Square Area: " + side * side);
    }

    public static void area(double side1, double side2) {

        System.out.println("Rectangle Area: " + side1 * side2);
    }

    public static void area(double greaterBase, double smallerBase, double height) {

        System.out.println("Trapeze Area: " + ((greaterBase+smallerBase)*height) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Area of the Rhombus: " + diagonal1 * diagonal2/2);
    }
}
