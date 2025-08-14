import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = entrada.nextInt();
        int fatorial =  1;

        for (int i = 1; i <= n1; i++) {
            fatorial *=i;
        }
        System.out.println("Fatorial de "+ n1 + " é " + fatorial);
     
    }
}
