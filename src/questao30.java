import java.util.Scanner;
public class questao30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, c, i;
        System.out.println("Informe um número que você deseja saber a tabuada do 1 até o 10: ");
        n = sc.nextInt();

        for ( i=1; i<=10; i++){
            c=i*n;
            System.out.println(i + " * " + n +" = " + c );
        }
    }
}
