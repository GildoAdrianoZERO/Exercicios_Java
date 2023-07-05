import java.util.Scanner;
public class questao16 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int x,y;

        System.out.println("Informe um número: ");
        x = scanner.nextInt();
        System.out.println("Informe outro número: ");
        y = scanner.nextInt();

        if (x == y){
            System.out.println("Os valores são iguais: "+x);
        }
        if (x > y) {
            System.out.println("O valor do maior número é: "+x);
        }  else {
            System.out.println("O valor do maior número é: "+y);
        }

    }
}
