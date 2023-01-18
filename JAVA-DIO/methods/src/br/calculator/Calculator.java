package br.calculator;

public class Calculator {

    public static void addition (double number1, double number2) {
        double result = number1 + number2;
        System.out.println("The addition of " + number1 + " plus " + number2 + " is: " + result);
    }

    public static void subtraction (double number1, double number2) {
        double result = number1 - number2;
        System.out.println("The subtraction of " + number1 + " minus " + number2 + " is: " + result);
    }

    public static void multiplication (double number1, double number2) {
        double result = number1 * number2;
        System.out.println("The multiplication of " + number1 + " multiplied by " + number2 + " is: " + result);
    }

    public static void division (double number1, double number2) {
        double result = number1 / number2;
        System.out.println("The division of " + number1 + " divided by " + number2 + " is: " + result);
    }
}
