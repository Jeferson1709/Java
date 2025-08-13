import java.util.Scanner; 

public class ComparacaoTresNumeros {
    public static void main(String [] agrgs) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite primeiro número: ");
        int n1 = entrada.nextInt();
        
        System.out.println("Digite segundo número: ");
        int n2 = entrada.nextInt();
        
        System.out.println("Digite terceiro número: ");
        double n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O primeiro número é o maior: " + n1);
            
        }else if (n2 > n1 && n2 > n3 ){
            System.out.println("O segundo número é o maior: " + n2);

        }else if(n3 > n1 && n3 > n2){
            System.out.println("O terceiro número é o maior: " + n3);

        }else {
            System.out.println("Os números são iguais");
        }

 }
}
