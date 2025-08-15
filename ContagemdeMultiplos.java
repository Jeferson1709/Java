public class ContagemdeMultiplos {
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 3; i < 100; i++) {
           
            if(i%3==0) {
                cont++;
            }
           
        }
        System.out.println("A quantide de números divisíveis por três é: "+cont);
    }
}
