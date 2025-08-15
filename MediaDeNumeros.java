
import java.util.Scanner;

public class MediaDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int numeros= 0;
        for (int i = 1; i <=5; i++) {
            System.out.println("Digite um numero");
             n = entrada.nextInt();
            numeros += n;
        }
        int media = numeros / 5;
        System.out.println("A média é :" + media);
    }
}
