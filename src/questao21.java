import java.util.Scanner;
public class questao21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;

        while(true){
            System.out.println("Informe um valor(Digite 0 para sair): ");
            x = sc.nextInt();

            if (x == 0){
                System.out.println("Programa encerrado");
                 break;
            } else if (x > 0){
                System.out.println("O valor é positivo. " + x);
            } else{
                System.out.println("O valor é negativo. " + x);
            }
        }
    }
}
