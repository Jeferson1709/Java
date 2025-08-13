import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da sua Compra: ");
        double valor = entrada.nextDouble();

        if (valor > 100) {
            System.out.println("Você tem um desconto de 10%: " + (valor - (valor * 0.10)));
            
        } else {
            System.out.println("Você não teve nenhum desconto o valor da compra foi: " + valor);
        }
        entrada.close();
    }
}
