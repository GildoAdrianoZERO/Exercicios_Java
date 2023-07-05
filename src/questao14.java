import java.util.Scanner;
public class questao14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y, s;
        System.out.println("Informe o valor de x: ");
        x = input.nextInt();
        System.out.println("Informe o volor de y: ");
        y = input.nextInt();

        if (x > y){
            s = x-y;
        } else {
            s = y - x;
        }

        System.out.println("A diferença entre o maior e o menor é: " + s);
    }
}
