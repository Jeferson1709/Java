import java.util.Scanner;

public class ComparaStrings {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Seja bem-vindo");
        System.out.println("Digite um texto: ");
        String text1 = entrada.nextLine();
        
        System.out.println("Digite um texto: ");
        String text2 = entrada.nextLine();

        if(text1.equals(text2)){
            System.out.println("As Strings(Texto) são iguais"); 
        }else{
            System.out.println("As Strings não são iguais"); 
        }

    }
}
