import java.util.Scanner;
public class questao38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, n, e;
        double salario, salarioExtra, salarioTotal;
        char resposta;
        do {
            System.out.println("Informe o código do funcionário: ");
            c = sc.nextInt();
            System.out.println("Informe as horas trabalhadas: ");
            n = sc.nextInt();
            if (n > 50) {
                e = n - 50;
                salarioExtra = e * 20;
                salario = 50 * 10;
                salarioTotal = salario + salarioExtra;
                System.out.println("Salário total do operário: "+c+ " é R$" +salarioTotal+ ". Salário excedente é R$" + salarioExtra);
            } else {
                salario = n*10;
                salarioExtra=0;
                salarioTotal=salario;
                System.out.printf("Salário total do operário: " +c+ " é R$ " +salarioTotal+ ". Não houve salário excedente.");
            }
            System.out.println("Deseja encerrar o programa? (S/N) ");
            resposta=sc.next().charAt(0);
            if ((resposta=='S') || (resposta=='s')){
                System.out.println("saindo...");
                break;
            }
        } while (true);
    }
}

