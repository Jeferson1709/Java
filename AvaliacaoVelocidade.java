import java.util.Scanner;

public class AvaliacaoVelocidade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua velocidade: ");
        double velo = entrada.nextDouble();

        if (velo <= 60) {
            System.out.println("Está dentro do limite de velocidade");

        } else if (velo >=61  && velo <= 80) {
            System.out.println("Está acima da velocidade");
        }else{
            System.out.println("Está muito acima da velocidade");
        }
    }
}
