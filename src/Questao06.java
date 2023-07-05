import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        float F = input.nextFloat();
        float C = (F - 32.0F) * 5.0F / 9.0F;
        System.out.println("A temperatura em gruas Celcius é de: " + C);
    }
}
