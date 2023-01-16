/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantity Number: ");
        int quantityNumber = sc.nextInt();

        int quantEven = 0, quantOdd = 0;

        int count = 0;

        do {
            System.out.println("Number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) quantEven++;
            else quantOdd++;

            count++;
        } while (count < quantityNumber);

        System.out.println("Quantity Number Even: " + quantEven + " / Quantity Number Odd: " + quantOdd);
    }
}
