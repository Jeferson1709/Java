// Exercício 56: Produto de Números
// Enunciado: Crie um programa que calcule o produto dos números inteiros de 1 a 10.
public class ProdutosNumeros {
    public static void main(String[] args) {
        int produto = 1;
        for (int i = 1; i <=10;i++) {
            produto *= i;
        }
        System.out.println("O produto dos números de 1 a 10 é: " + produto);
    }
}
