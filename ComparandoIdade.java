import java.util.Scanner;

public class ComparandoIdade {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua Idade: ");
    int idade1 = entrada.nextInt();

    System.out.println("Digite sua Idade: ");
    int idade2 = entrada.nextInt();

    if (idade1 > idade2) {
        System.out.println("A primeira pessoa é mais velha");

        }else if (idade2 > idade1) {
            System.out.println("A segunda peesoa é mais velha!!");

        }else {
            System.out.println("As duas pessoas tem a mesma idade");
        }
    }
}
