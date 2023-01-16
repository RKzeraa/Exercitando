/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        int number = sc.nextInt();

        int multiplication = 1;

        System.out.print(number + "!=");


        for(int i = number; i > 0; i--) {
            multiplication *= i;

            if (i != 1) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + "=" + (multiplication));
            }
        }
    }
}
