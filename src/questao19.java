import java.util.Scanner;
public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Informe o valor de cada lado do triângulo.");
        System.out.println("Informe o valor de A: ");
        a = scanner.nextDouble();
        System.out.println("Informe o valor de B: ");
        b = scanner.nextDouble();
        System.out.println("Informe o valor de C: ");
        c = scanner.nextDouble();

        if(a < b + c && b < a + c && c < a + b){
            if (a == b && b == c){
                System.out.println("O triângulo é EQUILATERO..");
            }else if(a==b || a==c || b==c){
                System.out.println("O triângulo é ISÓSCELES.");
            } else {
                System.out.println("O triângulo é ESCALENO.");
            }
        } else {
            System.out.println("Os lados fornecidos não caracterizam um triângulo.");
        }
    }
}
