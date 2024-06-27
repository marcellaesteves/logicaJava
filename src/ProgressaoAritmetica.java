import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroTermo, razao;
        int soma = 0;
        int i = 0;

        System.out.println("Escreva o primeiro termo da progressão aritmética:");
        primeiroTermo = scanner.nextInt();
        System.out.println("Escreva a razão da progressão aritmética:");
        razao = scanner.nextInt();

        while (i != 10){
            System.out.print(primeiroTermo + " ");
            soma += primeiroTermo;
            primeiroTermo += razao;
            i++;
        }
        System.out.println();
        System.out.println("A soma dos termos é igual a: " + soma);
    }
}
