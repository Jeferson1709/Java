import java.util.Scanner; 
public class ComparacoesSimples {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja Bem-vindo!!");
        System.out.println("Digite um número: ");
        int n1 = entrada.nextInt(); 
        
        System.out.println("Digite um número: ");
        int n2 = entrada.nextInt(); 

        if(n1 > n2){
            System.out.println("O primeiro número é maior");
        }else if(n2>n1){
            System.out.println("O segundo número é maior");
            
        }else {
            System.out.println("Os números são iguais");

        }
        entrada.close();
    }
}
