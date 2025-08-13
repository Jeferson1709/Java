import java.util.Scanner;

public class VerificaIade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

         if(idade >=60){
System.out.println("Você é Idoso");
        }
        else if (idade >= 18 && idade != 60) {
            System.out.println("Parabens!! Você é maior de idade.");
        }else {
            System.out.println("Vocé é menor de idade");
        }
    }
}
