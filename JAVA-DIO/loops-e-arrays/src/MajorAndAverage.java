/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MajorAndAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double major = 0;
        double sum = 0;
        double average;

        int count = 0;

        do {
            System.out.println("Number: ");
            double number = sc.nextDouble();

            if (number > major) {
                major = number;
            }

            sum = sum + number;

            count = count + 1;
        } while (count < 5);

        average = sum / 5;

        System.out.println("Major: " + major + " - Average: " + average);
    }
}
