import java.util.Scanner;
public class questao17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x;
    System.out.println("Informe um valor: ");
    x = scanner.nextDouble();
    if(x >= 0 && x <=9){
        System.out.println("Valor válido");
    } else {
        System.out.println("Valor Inválido");
    }
    }
}
