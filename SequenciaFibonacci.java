/**
 * Exercício 55: Sequência de Fibonacci
 * Enunciado: Escreva um programa que exiba os primeiros 10 termos da sequência
 * de
 * Fibonacci
 */
public class SequenciaFibonacci {
    public static void main(String[] args) {
        int termo1 = 0, termo2 = 1;
        System.out.print(termo1 + " " + termo2 + " ");
        for (int i = 3; i <= 10; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }

}
