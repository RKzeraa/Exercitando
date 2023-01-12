// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner;
import java.util.Locale;

public class Blobs {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
        int entry = reader.nextInt();
        int days = 0;

        while(entry > 0) {
            Double qtyFood = reader.nextDouble();
            days = Integer.parseInt(""+calcDays(qtyFood));

            System.out.println(days + " dias");
            entry--;
        }
        //TODO: Crie as condições necessárias para satisfazer o problema;
        //DICA: Utilize um for (int i = 0; i < quantidadeDeEntrada; i++) para verificar e passar por cada entrada
    }

    private static int calcDays(Double qtyFood) {
        if (qtyFood <= 1.0) {
            return 0;
        }
        Double eatFood = qtyFood / 2.0;
        return 1 + calcDays(eatFood);
    }
}