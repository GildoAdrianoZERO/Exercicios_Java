import java.util.Scanner;
public class questao41 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Informe a idade, em anos, do atleta: ");
        idade=sc.nextInt();
        if((idade>=5) && (idade<8)){
            System.out.println("Infantil A.");
        } else if ((idade>=8 ) && (idade<12)){
            System.out.println("Infantil B.");
        } else if((idade>=12) && (idade<14)){
            System.out.println("Juvenil A.");
        } else if((idade>=14) &&(idade<18)){
            System.out.println("Juvenil B.");
        } else {
            System.out.println("Adultos.");
        }

    }
}
