public class AtribuicaoSimples {
    public static void main(String[] args) {
        int n = 20; 

       int soma=  n += 2;
        int sub = n-= 15;
        int multi = n*=  4;
       int div =  n/= 2;
        int mod = n%=3;

        System.out.printf("Atribuição de soma: %d\nAtribuição de Subtração: %d\nAtribuição de Multiplicação: %d\nAtribuição de Divisão: %d\nAtribuição de Módulo: %d", soma, sub, multi,div,mod);
    }
}
