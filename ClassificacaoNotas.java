import java.util.Scanner;
public class ClassificacaoNotas {
    public static void main(String [] args ){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota =  entrada.nextDouble();

        if(nota >= 60){
            System.out.println("Você está aprovado!!");
        }else{
            System.out.println("Você foi reprovado !!");
        }

    }
}
