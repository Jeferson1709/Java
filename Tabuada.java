import java.util.Scanner; 
public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = entrada.nextInt();

        for(int i = 0; i <=10; i++){
            System.out.println(i+ " X "+ n1 + "= " +(n1 *i ));
        }
    }
}
