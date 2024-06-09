import java.util.Scanner;

public class NotaAprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite sua primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota:");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.print("A média das suas notas é " + media);
        if (media >= 7){
            System.out.print(" e você está aprovado");
        }
        else{
            System.out.println(" e você está reprovado");
        }
    }
}
