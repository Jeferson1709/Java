package exercicio_71;/* 
Exercício 71: Inversão de Array
Enunciado: Crie um programa que leia 6 números inteiros e armazene-os em um array.
Depois, exiba os valores do array na ordem inversa. */

import java.util.Scanner;

public class InversaoArray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valores[] = new int[6];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            valores[i] = entrada.nextInt();
        }
        System.out.print("[ ");

        for (int j = 5; j > 0; j--) {

            System.out.print(valores[j] + " ");
        }

        System.out.print(" ] ");

    }
}
