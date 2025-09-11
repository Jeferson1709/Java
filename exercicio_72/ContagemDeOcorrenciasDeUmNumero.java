package exercicio_72;
import  java.util.Scanner;
public class ContagemDeOcorrenciasDeUmNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int ocorrencias = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print(
        "Digite um número para contar as ocorrências:");
int numeroProcurado = scanner.nextInt();
        for (int numero : numeros) {
            if (numero == numeroProcurado) {
                ocorrencias++;
            }
        }
        System.out.println("O número " + numeroProcurado + " aparece "
                + ocorrencias + " vezes no array.");
    }
}
