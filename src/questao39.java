import java.util.Scanner;
public class questao39 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        char resposta;
        do{
           System.out.println("informe um número inteiro: ");
           num=sc.nextInt();
           if(num>0){
                System.out.println("O número é positivo");
           } else {
               System.out.println("O número é negativo");
           }
           if(num%2==0){
                System.out.println("O número é PAR");
            } else {
               System.out.println("o número é ÍMPAR");
           }
           System.out.println("Deseja finalizar o programa? (S/N)");
           resposta=sc.next().charAt(0);
           if ((resposta=='S') || (resposta=='s')){
               System.out.println("saindo...");
               break;
           }
        }while(true);
    }
}
