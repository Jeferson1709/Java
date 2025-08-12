import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem-vindp !!");
        System.out.println("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        
        System.out.println("Digite o primeiro número: ");
        int n2 = entrada.nextInt();
        
        System.out.println("Digite o primeiro número: ");
        int n3 = entrada.nextInt();

        if(n1> n2 || n1 > 3){
            System.out.println("O maior número é: "+ n1);
        }else if(n2 > n3 || n2 > n1){
            System.out.println("O maior número é: "+ n2);
            
        }else{
        System.out.println("O maior número é: "+ n3);
        }
    }
}
