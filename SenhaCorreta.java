import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        int senha = 12345;
        int tentativa;
        System.out.println("Digite sua senha: ");
        tentativa = entrada.nextInt();
        while (tentativa != senha) {
            System.out.println("Senha incorreta, digite novamente !");
            senha = entrada.nextInt();
        }
        System.out.println("Senha correta !");
    }
}
