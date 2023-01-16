/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        int number = sc.nextInt();

        System.out.println("[" + number + "] Multiplication Table");

        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
