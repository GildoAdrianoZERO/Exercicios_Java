import java.util.Scanner;
public class questao42 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; //a integer serve para iniciar a variavel com um valor extremo inteiro para garantir que o usuario vai digitar algo maior ou menor doq ela
        int menor = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Digite um número (ou 0 para sair): ");
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            //utilizei varios ifs e nao if else pois quero testar todas as condições e atualizar caso necessario mesmo se a primeira condição for atendida
        }

        // exibição do resultado

            System.out.println("O maior número é " + maior);
            System.out.println("O menor número é " + menor);

    }
}
