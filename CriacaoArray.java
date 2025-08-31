/* Crie um programa que declare um array de 5 números inteiros. Atribua valores
a esse array e, em seguida, exiba os valores no console. */
public class CriacaoArray {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        System.out.print("Elementos do Array: [ ");
        for (int e : array) {
            if ( e <= 4) {
                
                System.out.print(e+ ", " );
            }else{
                System.out.print( e);
            }

        }
System.out.print(" ]");

    }
}
