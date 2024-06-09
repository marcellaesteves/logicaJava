import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media, nota1, nota2;

        System.out.println("Digite sua primeira nota");
        nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A média de suas notas: " + nota1 + " e " + nota2 + " é " + media);

    }
}
