import java.util.Scanner;
public class questao36 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int maior, menor, num, soma=0, media;

        maior = Integer.MIN_VALUE; //utilizando as duas classes para iniciar uma com o menor valor possivel e a outra com o maior para que as variaveis possam ser atualizadas
        menor = Integer.MAX_VALUE;
        for(int c=1; c<=10;c++){
            System.out.println("Informe um valor inteiro positivo: ");
            num=sc.nextInt();
            if(num>maior){
                maior=num;
            }
            if(num<menor) {
                menor=num;
            }
            soma+=num;
        }
        media=soma/10;
        System.out.println("a media dos números digitados é: "+media);
        System.out.println("O maior valor digitado foi: "+maior);
        System.out.println("O menor valor digitado foi: "+menor);
    }
}
