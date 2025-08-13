import java.util.Scanner;

public class OperadoresComposto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = entrada.nextInt();
        System.out.println("Operadores Compostos");

        int soma = n1 += n2;
        int sub = n1 -= n2;
        int multi = n1 *= n2;
        int div = n1 /= n2;
        int mod = n1 %= n2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + multi);
        System.out.println("Divisão: " + div);
        System.out.println("Módulo: " + mod);

    }
}
