import java.util.Scanner;
public class questao11 {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       int a, b, c;
       System.out.println("Informe o valor de A: ");
       a = scanner.nextInt();
       System.out.println("Informe o valor de B: ");
       b = scanner.nextInt();
       System.out.println("Agora vamos inverter esses valores.");

       if (a != b){
           c = a;
           a = b;
           b = c;
           System.out.println("O valor de A: " + a);
           System.out.println("O valor de B: " + b);
       }
       else{
           System.out.println("Os valores são iguais.");
       }

   }
}
