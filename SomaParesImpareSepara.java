public class SomaParesImpareSepara {
    public static void main(String[] args) {
       
       int par =0;
       int impar= 0;
        for (int i = 1; i < 100; i++) {
            if (i%2==0) {
               par++;
            }
        }
        for (int i = 1; i < 100; i++) {
            if (!(i%2==0) ){
               impar++;
            }
        }
        System.out.println("Quantidade de números Pares: "+ par);
        System.out.println("Quantidade de números Impares: "+ impar);
    }
}
