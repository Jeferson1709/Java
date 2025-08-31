
import java.util.Scanner;

/*
Crie um programa que leia um número inteiro entre 1 e 10.
Caso o valor seja inválido,continue pedindo a entrada
até que um número válidoseja fornecido.
     */
public class ValidacaoEntradaWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int num = entrada.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("Número inválido. Tente novamente!");
            System.out.println("Digite um número entre 1 e 10: ");
            num =  entrada.nextInt();
        }
        System.out.println("Valor válido: "+ num);

    }
}
