import java.util.Scanner;
public class questao15 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;
        double recuperacao, novaMedia;

        System.out.println("Informe a primeria nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Informe a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.println("Informe a quarta nota: ");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Sua média é: " + media);

        if (media >= 7){
            System.out.println("APROVADO");
        } else {
            System.out.println("RECUPERAÇÃO");
        }
        System.out.println("Informe a nota da recuperação: ");
        recuperacao = scanner.nextDouble();

        novaMedia = (recuperacao+media)/2;

        if (novaMedia >= 7){
            System.out.println("APROVADO, sua media final foi: "+novaMedia);
        } else  {
            System.out.println("REPROVADO, sua media final foi: "+novaMedia);
        }


    }
}
