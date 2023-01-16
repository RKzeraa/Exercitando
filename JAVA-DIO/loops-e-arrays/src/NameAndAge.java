/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        while(true) {
            System.out.println("Name: ");
            name = sc.next();

            if (name.equals("0")) {
                break;
            }

            System.out.println("Age: ");
            age = sc.nextInt();


            System.out.println("Name: " + name + " - Age: " + age);
        }
    }
}
