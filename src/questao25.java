import java.util.Scanner;
public class questao25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //char s;
        double h, pesoIdeal;
        System.out.println("Informe seu sexo biologico(Ex.:M,F): ");
        String sexo = scanner.next();
        System.out.println("Informe sua altura em m: ");
        h = scanner.nextDouble();

        if (sexo.equalsIgnoreCase ("M")){
            pesoIdeal = (72.7*h)-58;
        } else {
            pesoIdeal = (62.1 *h)-44.7;
        }
        System.out.println("Seu peso ideal é: "+pesoIdeal);
    }
}
