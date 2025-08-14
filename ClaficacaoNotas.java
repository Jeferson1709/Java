
import java.util.Scanner;

public class ClaficacaoNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite sua nota :");
        int nota = entrada.nextInt();

        if (nota >= 0 && nota <=4) {
            System.out.println("Sua nota é insuficiente ");
        }else if (nota==5 ) {
            System.out.println("Sua nota está regular");
        }else if (nota >=6 && nota <=7) {
            System.out.println("Sua nota está Boa");
        }else if (nota >=8 && nota <=9 ) {
            System.out.println("Sua nota está muito boa !!!");
        }else {
            System.out.println("Nota Excelente!!");
        }
    }
}
