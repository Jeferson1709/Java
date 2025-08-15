import java.util.Scanner;
/**
 * Exercício 60: Contagem de Números Positivos (while)
 * Enunciado: Escreva um programa que leia números inteiros e exiba quantos
 * desses
 * números são positivos. O programa deve parar quando o usuário digitar um
 * número
 * negativo.
 */
public class ContagemDeNumerosWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite um número para saber a soma dos números  positivos parar digite um número negativo: ");
        
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        while (num >=0) {
            if (num > 0) {
                
                soma += num;
            }
            System.out.println("Digite um número: ");
         num = entrada.nextInt();
        }
        System.out.println("A soma dos números positivos é: "+ soma);
entrada.close();
    }
}
