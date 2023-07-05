import java.util.Scanner;

public class Questao01 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade minima do estoque: ");
        int Qmin = input.nextInt();
        System.out.println("Informe a quantidade maxima do estoque: ");
        int Qmax = input.nextInt();
        double media = (double) (Qmin + Qmax) / 2;
        System.out.println("A media do estoque é: " + media);
    }
}
