import java.util.Scanner;
public class questao22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x, a, b;

        System.out.println("informe um valor inteiro: ");
        x = sc.nextInt();
        if (x>0){
            a = x;
            System.out.println("O valor digitado é positivo: "+a);
        } else {
            b = x;
            System.out.println("O valor digitado é negativo: "+b);
        }
    }

}
