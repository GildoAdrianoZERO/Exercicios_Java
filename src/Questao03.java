import java.util.Scanner;

public class Questao03 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a indentidicação do vendedor: ");
        int idvendedor = input.nextInt();
        System.out.println("Informe o código da peça: ");
        int codpeca = input.nextInt();
        System.out.println("Informe a quantida de peças vendidas: ");
        int Quantvendida = input.nextInt();
        System.out.println("Informe o preço unitário da peça: ");
        double preco = input.nextDouble();
        double totalvendas = preco * (double)Quantvendida;
        double comissao = totalvendas * 0.05;
        System.out.printf("A comissão recebida pelo vendedor com ID: %d referente a peça de código: %d foi de R$ %.2f ", idvendedor, codpeca, comissao);
    }
}
