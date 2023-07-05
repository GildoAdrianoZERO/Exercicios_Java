import java.util.Scanner;
public class questao37 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opcao, x, y;
        char resposta;
        while(true){
            System.out.println("1 – Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Informe a opção desejada: ");
            opcao=sc.nextInt();
            if (opcao>=1 && opcao<=4){
                System.out.println("informe o primeiro valor: ");
                x=sc.nextInt();
                System.out.println("informe o segundo valor: ");
                y=sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (x + y));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (x - y));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (x * y));
                        break;
                    case 4:
                        System.out.println("Resultado: " + (x / y));
                        break;
                }
            } else{
                System.out.println("opção invalida.");
            }
            System.out.println("Deseja voltar ao menu principal? (S/N)");
            resposta=sc.next().charAt(0);
            if(resposta != 'S' && resposta != 's'){
                    System.out.print("FINALIZANDO...");
                    break;
                }
        }
    }
}
