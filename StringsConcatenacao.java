import java.util.Scanner;

public class StringsConcatenacao {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Seja bem-vindo!!");
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = entrada.nextLine();


        System.out.println("Muito obrigado(a) Seja bem-vindo " + nome + " " +sobrenome + "!");
        entrada.close();
    }


}
