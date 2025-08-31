import java.util.Scanner;

public class MediaValoresArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int array[] = new int[10];
        int valores = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o " + (i + 1) + " nº: ");
            array[i] = entrada.nextInt();
            valores += array[i];
        }

        double media = valores / (double) array.length;
        System.out.println("A média dos valores é: " + media);
    }

}
