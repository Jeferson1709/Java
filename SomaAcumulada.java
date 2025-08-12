import java.util.Scanner;

public class SomaAcumulada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros = 0;
        int n1;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite um número: ");
            n1 = entrada.nextInt();
            numeros += n1;
        }

        System.out.println("Valor total: " + numeros);
        entrada.close();
    }
}