import java.util.Scanner;

public class AreaDeUmRetagulo {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja be-vindo!!");
        System.out.println("Digite o tamanho do lado: ");
        double b = entrada.nextDouble();

        System.out.println("Digite o tamanho do altura: ");
        double h = entrada.nextDouble();

        double area = b*h; 

        System.out.println("O valor da área é: "+ area);

    }
}
