
import java.util.Scanner;

public class MultiplicacaoAcumulada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero; 
        System.out.println("Digite um número :");
        numero = entrada.nextInt();

        while (numero <= 1000) { 
            numero *= 2;
        System.out.println("Valor após multiplicação: " + numero);
        }
        System.out.println("Valor do número: "+ numero);
    }
}
