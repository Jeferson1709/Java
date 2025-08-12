import java.util.Scanner;
public class EntradadeDados {

    public static void main(String[] args) {
        /**
         Escreva um programa que leia um número inteiro e um número decimal do teclado e, em
seguida, exiba a soma desses números no console.
Dica: utilize o pacote/classe Scanner.
         */

         Scanner entrada = new Scanner(System.in);
         System.out.println("Seja bem-vindo!!");
         System.out.println("Digite um número inteiro: ");
         int num = entrada.nextInt();

         System.out.println("Digite um número decimal: ");
        double num2 = entrada.nextDouble();

        int soma= (num)+ (int)num2;
        System.out.println("A soma dos números : "+ soma);
         
         entrada.close();
    }
}
