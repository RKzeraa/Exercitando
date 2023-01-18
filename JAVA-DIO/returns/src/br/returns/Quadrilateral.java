package br.returns;

public class Quadrilateral {

    public static double area(double side) {

        return (side * side);
    }

    public static double area(double side1, double side2) {

        return (side1 * side2);
    }

    public static double area(double greaterBase, double smallerBase, double height) {

        return (((greaterBase+smallerBase)*height) / 2);
    }

    public static double area(float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2/2);
    }
}
