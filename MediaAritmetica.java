import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*
         Escreva um programa que leia três números inteiros do usuário e calcule a média aritmética
deles. Exiba o resultado no console.
Dica: Sempre que os exercícios pedirem para ‘ler’ algo, você deve utilizar a classe Scanner.
         */

         System.out.println("Seja bem-vindo!!");
         System.out.println("Digite o primeiro número:");
         int n1 = entrada.nextInt();
         
         System.out.println("Digite o primeiro número:");
         int n2 = entrada.nextInt();
         
         System.out.println("Digite o primeiro número:");
         int n3 = entrada.nextInt();

         int media = (n1+n2+n3)/3;

        System.out.println("A média dos números: "+ n1+ ", "+ n2 + ", "+n3+ "\né: "+ media);
    }
}
