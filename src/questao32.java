import java.util.Scanner;
public class questao32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma = 0;

        do {
            System.out.println("Informe um número positivo inteiro(Informe um negativo para parar o programa): ");
            x = sc.nextInt();
            if ((x % 2 != 0) && (x<10 && x>0)) { //if usado para atender a condição da questao
                for(y=0; y<20;y++){
                soma += Math.pow(x, 2); // funçao para fazer o quadrado do numero
            }}
        } while (x > 0);
        soma = -1; //a soma estava informando um valor (+1) no calculo
        System.out.print("soma dos quadrados dos 20 primeiros números inteiros positivos \n" +
                "ímpares número informado pelo usuário menor que 10 e maior que zero" + soma);
    }
}
