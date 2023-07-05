import java.util.Scanner;
public class questao20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, maior, menor;

        do {
            System.out.println("Informe o valor de A(maior que zero): ");
            a = sc.nextInt();
        } while (a<=0);
        do {
            System.out.println("Informe o valor de B(maior que zero): ");
            b = sc.nextInt();
        } while (b<=0);
        do {
            System.out.println("Informe o valor de C(maior que zero): ");
            c = sc.nextInt();
        } while (c<=0);

        if(a>b && a>c){
            maior = a;
        } else if (b>a && b>c){
            maior = b;
        } else {
            maior = c;
        }
        if(a<b && a<c){
            menor = a;
        } else if (b<a && b<c){
            menor = b;
        } else {
            menor = c;
        }
        System.out.println("O menor valor lido multiplicado pelo maior: " + (menor*maior));
        System.out.println("o maior valor dividido pelo menor: " + (maior/menor));
    }
}
