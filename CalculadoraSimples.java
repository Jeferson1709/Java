import java.util.Scanner;

public class CalculadoraSimples{

public static void main(String[]args ){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Seja bem-vindo");
    System.out.println("Digite um número inteiro: ");
    int num = entrada.nextInt();
    System.out.println("Digite mais um número inteiro: ");
    int num2 = entrada.nextInt();

    int soma, sub, multi, div, mod;
    soma= num + num2;
    sub= num - num2; 
    multi = num * num2; 
    div= num / num2; 
    mod = num % num2 ; 

    System.out.printf("A soma dos números é: %d\nA subtração dos números é: %d\nMultiplicação dos números é: %d\nA divisão entre os números é: %d\nO módulo dos números é: %d ",soma,sub,multi,div,mod );
    entrada.close();
    }
}