import java.util.Scanner;
public class questao23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        double a, b, r;
        System.out.println("Informe um valor: ");
        a = sc.nextDouble();
        System.out.println("Informe outro valor: ");
        b = sc.nextDouble();
        System.out.println("Informe qual operação você deseja realizar. \n 1- Adição. \n 2- Subtração. \n 3- Multiplicação. \n 4- Dvisisão.");
        x = sc.nextInt();

        r=0;

        switch (x){
            case 1: r = a + b;
                break;
            case 2: r = a - b;
                break;
            case 3: r = a * b;
                break;
            case 4: r = a / b;
                break;
            default: System.out.println("Opção invalida.");
        }
        System.out.println("O resultado da sua conta foi: "+r);
    }
}
