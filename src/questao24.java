import java.util.Scanner;
public class questao24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y, e;
        double media;
        do{
            System.out.println("Informe dois números inteiros: ");
            x = input.nextInt();
            y = input.nextInt();
            System.out.println("Escolha uma opção: ");
            System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro. \n" +
                               "2 – Verificar se os dois números lidos são pares. \n" +
                               "3 – Verificar se a média dos dois números é maior ou igual a 7. \n" +
                               "4 – Sair.");
            e = input.nextInt();
            switch (e) {
                case 1:
                    if (x % y == 0 || x % y == 0){
                        System.out.println("Um dos números é multiplo do outro.");
                    }else{
                        System.out.println("Nenhum dos números é multiplo do outro.");
                    }
                    break;
                case 2:
                    if(x % 2 == 0 && y % 2 == 0){
                        System.out.println("Os números são pares.");
                    } else {
                        System.out.println("Um dos números ou os dois números não são pares.");
                    }
                    break;
                case 3:
                    media = (x+y)/2;
                    if (media >= 7){
                        System.out.println("A média dos dos dois números é mais ou igual a 7.");
                } else{
                        System.out.println("A média dos números é menor que 7");
                }
                    break;
                case 4:
                    System.out.println("Saindo ...");
                    break;
                default: System.out.println("Opção invalida.");
            }

        } while (e!=4);
    }
}
