import java.util.Scanner;
public class questao40 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double indicePoluicao;
        char resposta;

        do {
            System.out.println("Informe o índice de pulição da sua empresa: ");
            indicePoluicao=sc.nextDouble();

            if ((indicePoluicao >= 0.3) && (indicePoluicao < 0.4)){
                System.out.println("As indústrias do 1º grupo devem ser intimadas a suspenderem suas atividades");
            } else if((indicePoluicao >= 0.4) && (indicePoluicao < 0.5)){
                System.out.println("As indústrias do 1º e 2° grupo devem ser intimadas a suspenderem suas atividades");
            } else if(indicePoluicao>=0.5){
                System.out.println("As indústrias de todos os grupos devem ser notificados a paralisarem suas atividades.");
            } else {
                System.out.println("O índice de poluição aceitável.");
            }

            System.out.println("Deseja encerrar o programa?(S/N)");
            resposta=sc.next().charAt(0);

            if((resposta== 'S')||(resposta=='s')){
                System.out.print("saindo...");
                break;
            }
        }while (true);
    }
}
