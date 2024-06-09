import java.util.Scanner;

public class MediaCond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Qual sua primeira nota?");
        nota1 = scanner.nextDouble();
        System.out.println("Qual sua segunda nota?");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("Sua média foi " + media + " e você está aprovado");
        } else if ((media < 7) && (media > 5)) {
            System.out.println("Sua média foi " + media + " e você está de recuperação");
        } else {
            System.out.println("Sua média foi " + media + " e você está reprovado");
        }
    }
}
