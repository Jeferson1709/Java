
import java.util.Scanner;

public class EstrururasCondicionais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if (num > 0 && num != 0) {
            System.out.println("O número é positivo ");
        }else if (num<0 && num != 0 ) {
            System.out.println("O número é negativo");
        }else {
            System.out.println("O número é igual a zero");
        }
    }
}
