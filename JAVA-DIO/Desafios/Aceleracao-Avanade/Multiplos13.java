// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner;

public class Multiplos13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int n1 =sc.nextInt();
		int n2= sc.nextInt();

    //TODO: Crie as condições necessárias para solucionar o problema;
    if ( n1 > n2) {
      for (int i = n2; i <= n1; i++){
        if (i % 13 !=0) {
          soma += i;
        }
      }
    } else { 
      for (int i = n1; i <= n2; i++) {
        if (i % 13 !=0) {
          soma += i;
        }
      }
    }
    System.out.println(soma);
  }
}