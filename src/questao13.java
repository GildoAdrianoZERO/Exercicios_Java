import java.util.Scanner;

public class questao13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a, b, c, maior,  meio, menor;

        System.out.println("Imforme 3 valores diferentes.");
        System.out.println("informe o 1° valor: ");
        a = scanner.nextInt();
        System.out.println("informe o 2° valor: ");
        b = scanner.nextInt();
        System.out.println("Informe o 3° valor: ");
        c = scanner.nextInt();

        if (a > b && a > c){
            maior = a;
            if (b>c ){
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else if (b>a && b>c){
            maior = b;
            if (c>a){
                meio = c;
                menor = a;
            } else {
                meio = a;
                menor = c;
            }
        } else {
            maior = c;
        } if (a>b){
            meio = a;
            menor = b;
        }else{
            meio = b;
            menor = a;
        }
        System.out.println("os números em ordem descrescente é " + maior + ", " + meio + ", " + menor);
    }
}
