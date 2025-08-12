import java.util.Scanner;
public class ConversaoTemperatura {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem-vindo!!");
        System.out.println("Digite a temperatura em C°");
        double temp = entrada.nextDouble();

        double fahrenheit = (temp*9/5)+32;

        System.out.printf("Temperatura em Fahrenheit: %.2f", fahrenheit);

        entrada.close();
    }
}
