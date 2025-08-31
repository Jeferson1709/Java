import java.util.Scanner;

public class RaizQuadradaAproximada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        
        int numero = scanner.nextInt();

        int raizAprox = 0;
        


        while (raizAprox * raizAprox < numero) {
            raizAprox++;
        }
        
        if (raizAprox * raizAprox == numero) {
            System.out.println("Raiz quadrada exata de " + numero + " é:" + raizAprox);
        
        } else {
        
            System.out.println("Raiz quadrada aproximada de " + numero +" é: " + raizAprox);
        }
    }
}