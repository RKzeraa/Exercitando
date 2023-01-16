/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Grade from 0 to 10: ");
        int grade = sc.nextInt();

        while(grade < 0 | grade > 10) {
            System.out.println("Invalid Grade!");
            System.out.println("Try Again. Grade: ");
            grade = sc.nextInt();
        }

        System.out.println("Grade: " + grade);
    }
}
