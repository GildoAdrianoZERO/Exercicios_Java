import java.util.Scanner;
public class questao31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, somaImpar, somaPar;
        somaImpar=0; //inicializando as variaveis de soma em 0
        somaPar=0;

        while (true){ //usando "true" para iniciar o while
            System.out.println("Informe um número inteiro positivo(informe um negativo para finalizar o programa): ");
            numero = sc.nextInt();
            //colocando a pergunta antes de inicializar a condicional para a pergunta ser sempre repetida
            if (numero<0) { //sair do loop quando o valor digitado foi menos que 0 (negativo)
                System.out.println("saindo...");
                break;
            } else if(numero %2==0){ //expressao para saber se o número é positivo
                System.out.println(numero + " é par.");
                somaPar += numero;
            } else {
                System.out.println(numero + " é impar.");
                somaImpar += numero;
            }
        }
        System.out.println("A soma de todos os números pares digitados foi de: " + somaPar);
        System.out.print("A soma de todos os números impares digitados foi de: "+ somaImpar );
    }
}
