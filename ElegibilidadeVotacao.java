import java.util.Scanner;

public class ElegibilidadeVotacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem-vindo");
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        if(idade > 18 ){
            System.out.println("Você é maior de idade, pode votar");
            
        }else{

            System.out.println("Você é menor de idade, não pode votar");
        }
        entrada.close();
    }
}
