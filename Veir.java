import java.util.Scanner; 
public class Veir {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o primeiro número inteiro");
    int n1 = entrada.nextInt();
    
    
    
    
    System.out.println("Digite o segundo número inteiro");
    int n2 = entrada.nextInt();
    
    System.out.println("Digite o terceiro número inteiro");
    int n3 = entrada.nextInt();

    int positivos = 0;

    if(n1>0)positivos++; 
    if(n2>0)positivos++;
    if(n3>0)positivos++;

    if (positivos > 2) {
        System.out.println("Mais de dois números são positivos");
    }
    if(positivos < 0){
        System.out.println("Nenhum número é positivo. ");
    }else{
        System.out.println("Apenas um número é positivo ");
    }

}
    
}