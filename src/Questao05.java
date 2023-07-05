import java.util.Scanner;

public class Questao05 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tempo percorridos na viagem: ");
        float tempo = input.nextFloat();
        System.out.println("Informe a velocidade media percorrida durante a viagem: ");
        float velocidade = input.nextFloat();
        float distancia = tempo * velocidade;
        System.out.println("Essa foi a distancia percorrida durante a viagem: " + distancia);
        float litrosUsados = distancia / 12.0F;
        System.out.println("A quantidade em litros de gasolina utilizada na viagem foi de: " + litrosUsados);
    }
}
