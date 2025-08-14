import java.util.Scanner;

public class OperacoesMatematicas {
   public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite o primeiro número: ");
double numero1 = scanner.nextDouble();
System.out.print("Digite o segundo número: ");
double numero2 = scanner.nextDouble();
System.out.print("Digite o operador (+, -, *, /): ");
char operador = scanner.next().charAt(0);
switch (operador) {
    case '+':
    System.out.println("Resultado: " + (numero1 + numero2));    
    break;
    case '-':
    System.out.println("Resultado: " + (numero1 - numero2));
    break;
    case '*':
    System.out.println("Resultado: " + (numero1 * numero2));
    break;
case '/':

if (numero2 != 0) {
System.out.println("Resultado: " + (numero1 /
numero2));
} else {
    System.out.println("Divisão por zero não é permitida.");
}
break;
default:
System.out.println("Operador inválido.");
}
}
}