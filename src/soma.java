import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma;

        System.out.println("Digite o primeiro número que deseja somar");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número que deseja somar");
        double numero2 = scanner.nextDouble();

        soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + soma);

    }
}
