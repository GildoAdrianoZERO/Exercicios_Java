import java.util.Scanner;
public class questao12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x;

        System.out.println("Informe um número: ");
        x = scanner.nextInt();

        if (x >= 0){
            x = x;
        }
        else{
            x = x*(-1);
        }
        System.out.println("O modulo desse número é: " + x);
    }
}
