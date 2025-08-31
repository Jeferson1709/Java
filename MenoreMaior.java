import java.util.Scanner;

public class MenoreMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int array[] = new int[10];
        int maior = 0 , menor = 0 , aux =0;
        for(int i = 0 ; i < array. length; i++){
            System.out.println("Digite um número: ");
            array[i] = entrada.nextInt();
            maior = 0;
            
            menor = array[i];
            if(menor>  maior){
                }
            if (maior <= menor) {
                aux = menor;
                menor =  maior;
                maior = aux;

            }
            // if(menor < maior){

            //     menor = maior; 
            // }
            

        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
