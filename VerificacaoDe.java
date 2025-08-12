import java.util.Scanner;

public class VerificacaoDe{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem-vindo!!");
        System.out.println("Digite um número: ");
        
        int num = entrada.nextInt();

        if( num % 2 == 0  ){
            System.out.println("O número é Par");
            
        }else{
            System.out.println("O número é Impar");

        }
    }
}