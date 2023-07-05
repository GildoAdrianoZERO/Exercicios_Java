import java.util.Scanner;
public class questao34 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x, y, i;

        while(true) {
            System.out.println(" (digite um número qualquer. caso deseje finalizar digite um número negativo.)");
            i = sc.nextInt();
            if(i>=0){
            System.out.println("informe um número inteiro qualquer: ");
            x = sc.nextInt();
            System.out.println("informe outro número: ");
            y = sc.nextInt();
            }else{
                System.out.print("SAINDO...");
                break;
            }
            if(x>y){
                System.out.println("o maior número digitado foi: "+x);
                System.out.println("o menor número digitado foi: "+y);
            } else{
                System.out.println("o maior número digitado foi: "+y);
                System.out.println("o menor número digitado foi: "+x);
            }
        }

    }
}
