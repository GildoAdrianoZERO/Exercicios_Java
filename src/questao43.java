import java.util.Scanner;
public class questao43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Conversão de Graus Celsius em Graus Fahrenheit");
            System.out.println("2 - Conversão de Graus Fahrenheit em Graus Celsius");
            System.out.println("3 - Peso ideal do homem");
            System.out.println("4 - Peso ideal da mulher");
            System.out.print("Opção escolhida: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em graus Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + " graus Celsius correspondem a " + fahrenheit + " graus Fahrenheit.");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em graus Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.println(fahrenheit + " graus Fahrenheit correspondem a " + celsius + " graus Celsius.");
                    break;

                case 3:
                    System.out.print("Digite a altura em metros: ");
                    double altura = sc.nextDouble();
                    double pesoIdealHomem = (72.7 * altura) - 58;
                    System.out.println("O peso ideal para um homem com altura de " + altura + " metros é " + pesoIdealHomem + " kg.");
                    System.out.print("Digite o peso atual: ");
                    double pesoAtualHomem = sc.nextDouble();
                    if (pesoAtualHomem > pesoIdealHomem) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoAtualHomem < pesoIdealHomem) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a altura em metros: ");
                    altura = sc.nextDouble();
                    double pesoIdealMulher = (62.1 * altura) - 44.7;
                    System.out.println("O peso ideal para uma mulher com altura de " + altura + " metros é " + pesoIdealMulher + " kg.");
                    System.out.print("Digite o peso atual: ");
                    double pesoAtualMulher = sc.nextDouble();
                    if (pesoAtualMulher > pesoIdealMulher) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoAtualMulher < pesoIdealMulher) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            char resposta;
            System.out.println("Deseja encerrar o programa?(S/N)");
            resposta = sc.next().charAt(0);
            if ((resposta=='S') || (resposta == 's')){
                System.out.println("encerrando...");
                break;
            }


        } while (true);

    }
}
