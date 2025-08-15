
import java.util.Scanner;

public class ValidacaoEntrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 10: ");
        int numero = entrada.nextInt();
        while (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Tente novamente.");
            System.out.print("Digite um número entre 1 e 10: ");
            numero = entrada.nextInt();
        }
        System.out.println("Número válido: " + numero);
    }
}

