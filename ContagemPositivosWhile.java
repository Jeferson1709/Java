
import java.util.Scanner;

public class ContagemPositivosWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int positivos = 0;

        System.out.println("Seja bem-vindo, digite um número (negativo para parar): ");
        
        num = entrada.nextInt();
        
        while (num > -1) {
            if (num > 0 )positivos++;
            System.out.println("Digite um número (negativo para parar): ");       
        
            num = entrada.nextInt(); 
        
    }
    System.out.println("O total de números positivos é: " + positivos);
    }
}
