import java.util.Scanner;

public class AproveitamentoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Qual sua primeira nota?");
        nota1 = scanner.nextDouble();
        System.out.println("Qual sua segunda nota?");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        if (media >= 9){
            System.out.println("Aproveitamento: A");
        } else if ((media < 9) && ( media >= 8)) {
            System.out.println("Aproveitamento: B");
        } else if ((media < 8) && (media >= 7)) {
            System.out.println("Aproveitamento: C");
        } else if ((media < 7) && (media >= 6)) {
            System.out.println("Aproveitamento: D");
        } else if ((media < 6) && (media >= 5)) {
            System.out.println("Aproveitamento: E");
        }else{
            System.out.println("Aproveitamento: F");
        }
    }
}
