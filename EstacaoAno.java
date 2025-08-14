import java.util.Scanner;

public class EstacaoAno {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite um número");
        int opcao = entrada.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Verão");
                break;
                
                case 2:
                System.out.println("Outono");
                
                break;
                case 3:
                System.out.println("Inverno");
                
                break;
                case 4:
                System.out.println("Primeira");
                
                break;
            
                default: 
                System.out.println("Opção invalida!!");
                break;
        }
    }
}
