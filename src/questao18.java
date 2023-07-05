import java.util.Scanner;
public class questao18 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int codigo;
        System.out.println("Digite um número inteiro (1,2,3): ");
        codigo = scanner.nextInt();

        switch(codigo){
            case 1:
                System.out.println("UM");
                    break;
            case 2:
                System.out.println("DOIS");
                    break;
            case 3:
                System.out.println("TRÊS");
                    break;

        }

    }
}
