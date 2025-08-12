public class OperacoesAritmeticas {
    public static void main(String[] args){
        /*
         Desenvolva um programa que declare duas variáveis int e realize as operações de soma,
subtração, multiplicação, divisão e módulo entre elas. Exiba os resultados de cada
operação.
         */
        int  a = 17;
        int  b = 13;
        
        int operacao1 = a+b;
        int operacao2= a-b;
        int operacao3= a*b; 
        int operacao4 = a/b;
        int operacao5 = a % b;

        System.out.println("Soma: "+operacao1);
        System.out.println("Subtração: "+operacao2);
        System.out.println("Multiplicação: "+operacao3);
        System.out.println("Divisão "+ operacao4);
        System.out.println("Módulo: "+ operacao5);
    }
}
