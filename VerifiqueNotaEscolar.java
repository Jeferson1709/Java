import java.util.Scanner;

public class VerifiqueNotaEscolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        int nota = entrada.nextInt();
        if (nota < 5) {
            System.out.println("insuficiente");
        }else if (nota >=5 && nota<= 7) {
            System.out.println("Suficiente");
        }else {
            System.out.println("Bom");
        }
        entrada.close();
    }
}
