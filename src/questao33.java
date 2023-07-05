import java.util.Scanner;
public class questao33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matricula=0, alunos=0, inicializacao;
        double nota, media, somaNotas=0;

        System.out.println("Digite 1 para iniciar o programa ou -1 para finalizar : ");
        inicializacao = sc.nextInt();

            while (inicializacao != -1){

                System.out.println("Informe o número da matrícula do estudante: ");
                matricula = sc.nextInt();
                System.out.println("Informe a nota do estudante: ");
                nota = sc.nextDouble();
                somaNotas += nota; // cada nota adicionada sera somada e o resultado será armazenado na variavel somaNotas
                alunos++; // aqui começa a contagem de quantos alunos sao, sem a necessidade do user informar quantos sao, no inicio do programa.
                System.out.println("digite 1. caso deseje finalizar o programa digite um número negativo.");
                inicializacao = sc.nextInt(); //necessario para finalizar o loop
            }
            if (alunos > 0){
                media = somaNotas / alunos;
                System.out.println("A media das notas dos alunos foi de: " +media);
            } else {
                System.out.print("...");
            }
    }
}
