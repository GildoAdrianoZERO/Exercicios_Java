import java.util.Scanner;

public class Questao04 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int A = input.nextInt();
        System.out.println("Informe o valor de B: ");
        int B = input.nextInt();
        System.out.println("Informe o valor de C: ");
        int C = input.nextInt();
        System.out.println("Informe o valor de D: ");
        int D = input.nextInt();
        int AB = A + B;
        int AC = A + C;
        int AD = A + D;
        int BC = B + C;
        int BD = B + D;
        int CD = C + D;
        int ab = A * B;
        int ac = A * C;
        int ad = A * D;
        int bc = B * C;
        int bd = B * D;
        int cd = C * D;
        System.out.println("A + B = " + AB);
        System.out.println("A * B = " + ab);
        System.out.println("A + C = " + AC);
        System.out.println("A * C = " + ac);
        System.out.println("A + D = " + AD);
        System.out.println("A * D = " + ad);
        System.out.println("B + C = " + BC);
        System.out.println("B * C = " + bc);
        System.out.println("B + D = " + BD);
        System.out.println("B * D = " + bd);
        System.out.println("C + D = " + CD);
        System.out.println("C * D = " + cd);
    }
}
