import java.util.Scanner;

public class MenuOpcaosDowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, n1, n2, soma, subtracao, multiplicacao, divisao;
        System.out.println();

        do {

            System.out.println("Seja bem vindo !");

            System.out.println("1 - Para somar dois números: ");
            System.out.println("2- Para subtrair dois números: ");
            System.out.println("3 - Para multiplicar dois  números :");
            System.out.println("4- Para Dividir");
            System.out.println("0 - Sair ");
            opcao = entrada.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println("Digite o primeiro número :");
                    n1 = entrada.nextInt();

                    System.out.println("Digite o segundo número :");
                    n2 = entrada.nextInt();
                    soma = n1 + n2;

                    System.out.println("A soma dos  dois números é: " + soma);

                    break;

                case 2:
                    System.out.println("Digite o primeiro número :");
                    n1 = entrada.nextInt();

                    System.out.println("Digite o segundo número :");
                    n2 = entrada.nextInt();
                    subtracao = n1 - n2;

                    System.out.println("A subtração dos dois números é: " + subtracao);

                    break;
                case 3:
                    System.out.println("Digite o primeiro número : ");
                    n1 = entrada.nextInt();

                    System.out.println("Digite o segundo número :");
                    n2 = entrada.nextInt();

                    multiplicacao = n1 * n2;

                    System.out.println("A multiplicação dos dois números é: " + multiplicacao);
                    break;

                case 4:
                    do {

                        System.out.println("Digite o primeiro número : ");
                        n1 = entrada.nextInt();

                        System.out.println("Digite o segundo número :");
                        n2 = entrada.nextInt();
                    } while (n1 <= 0 && n2 <= 0);

                    divisao = n1 * n2;

                    System.out.println("A multiplicação dos dois números é: " + divisao);

                    break;
                case 0:
                    System.out.println("Obrigado volte sempre !");
                    break;
                default:
                    System.out.println("Digite uma opção válida !");
                    break;

            }
        } while (opcao != 0);
    }
}
