import java.util.Scanner;

public class AvaliacaoTemperatura {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in ); 
        System.out.println("Digite a temperatura em graus °C");
        int temp = entrada.nextInt();

        if (temp < 15) {
            System.out.println("Está muito frio....");
        }else if (temp>=15 && temp <=30) {
        System.out.println("O clima está agradável:)");
        }else{
            System.out.println("Está quente!!");
        }
        entrada.close();
    }
}
