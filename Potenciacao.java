import java.util.Scanner;

public class Potenciacao {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem-vindo");
        System.out.println("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        System.out.printf("A pontecia é: %.2f", Math.pow(n1,n2));

    }
}
