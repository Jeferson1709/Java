import java.util.Scanner;

public class VerificacaoIntervalo {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem-vindo!!");
        System.out.println("Digite um número :");
        int num = entrada.nextInt();

        if(num >10 && num< 20){
            System.out.println("Está no intervalo!!");
        }else{

            System.out.println(" Não está no intervalo!!");
        }
        

    }
}
