import java.util.Scanner;

public class SomaElementosArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, j = 0, soma = 0;
        int array[];

        while (j < 5) {
            array = new int[5];

            System.out.println("Digite um número");
            n = entrada.nextInt();
            soma += n;
            for (int i = 0; i < array.length; i++) {
                array[i] = n;

                j++;

            }
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
