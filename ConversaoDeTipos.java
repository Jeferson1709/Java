public class ConversaoDeTipos {
     public static void main(String[] agrs){

        double valorDouble = 9.99; 

        //Conversão explícita de Double para int 
        int valorInt = (int) valorDouble; 


        // Conversão implícita de int para Double 
        int numero =10; 
        double numeroConvertido = numero; 

         System.out.println("Valor double: "+ valorDouble);
         System.out.println("Valor convertido para int: "+ valorInt);
         System.out.println("Número int: "+numero );
         System.out.println("Número convertido para double: " + numeroConvertido);
     }
}
