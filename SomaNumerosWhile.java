
import java.util.Scanner;

public class SomaNumerosWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        System.out.println("Digite números para somar. Digite 0 para parar.");
        System.out.println("Digite um número: ");
        int n = entrada.nextInt();
        while (n != 0) {
            soma += n;
            System.out.println("Digite um número: ");
            n = entrada.nextInt();
        }
        System.out.println("Valor da Soma " + soma);
    }
}
