package br.returns;

public class Main {
    public static void main(String[] args){

        System.out.println("Returns");

        double squareArea = Quadrilateral.area(3);
        System.out.println("Square Area: " + squareArea);

        double rectangleArea = Quadrilateral.area(5d, 5d);
        System.out.println("Rectangle Area: " + rectangleArea);

        double trapezeArea = Quadrilateral.area(7, 8, 9);
        System.out.println("Trapeze Area: " + trapezeArea);

        double areaRhombus = Quadrilateral.area(5f, 5f);
        System.out.println("Area of the Rhombus: " + areaRhombus);
    }
}
