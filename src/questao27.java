import java.util.Scanner;
public class questao27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        // leitura da quantidade de números a serem processados
        System.out.print("Digite a quantidade de números a serem processados: ");
        quantidade = sc.nextInt();

        // leitura dos números e cálculo dos fatoriais
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            int fatorial = 1;
            for (int j = 1; j <= numero; j++) {
                fatorial *= j;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        // fecha o objeto Scanner
        sc.close();
    }
}
