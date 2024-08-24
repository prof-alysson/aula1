import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String aluno;
        float nota_a1;
        float nota_a2;
        float media;
        float exame;
        float media_final;

        System.out.println("Nome do aluno: ");
        aluno = entrada.next();
        System.out.println("Nota A1: ");
        nota_a1 = entrada.nextFloat();
        System.out.println("Nota A2: ");
        nota_a2 = entrada.nextFloat();
        media = (nota_a1+nota_a2)/2;
        System.out.println("Sua media foi: "+media);
        if(media<4){
            System.out.println("Reprovado");
        } else if (media < 6) {
            System.out.println("Nota Exame: ");
            exame = entrada.nextFloat();
            media_final = (media+exame)/2;
            if (media_final < 6){
                System.out.println("Reprovado");
            }
            else{
                System.out.println("Aprovado com a média: "+media_final);
            }
        }
    }
}
