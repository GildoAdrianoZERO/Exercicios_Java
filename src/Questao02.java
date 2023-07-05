import java.util.Scanner;

public class Questao02 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a cotação atual do dolar: ");
        float cotacaoDolar = input.nextFloat();
        System.out.println("Informe o valor em dolar que você deseja converter: ");
        float valorDolar = input.nextFloat();
        float valorReal = valorDolar * cotacaoDolar;
        System.out.printf("O valor em real da quantia é R$: %f", valorReal);

    }
}
