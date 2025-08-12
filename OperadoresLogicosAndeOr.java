
import java.util.Scanner;

public class OperadoresLogicosAndeOr {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem-vindo !!");
        System.out.println("Digite o primeiro nnúmero inteiro");
        int n1 = entrada.nextInt(); 
        
        System.out.println("Digite o primeiro nnúmero inteiro");
        int n2 = entrada.nextInt(); 
        
        System.out.println("Digite o primeiro nnúmero inteiro");
        int n3 = entrada.nextInt(); 


        if(n1> 10 || n2> 10 | n3> 10){
            System.out.println("Um dos números é maior que 10!");
        }else if (n1 > 10 && n2 > 10 && n3 > 10 ) {
            System.out.println("Todos os números são maiores que 10!");
        }else { 
            System.out.println("Nenhuma das condição foi satisfeita");
        }
    }
}
