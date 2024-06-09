import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número que deseja saber se é par ou ímpar:");
        numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println(numero + " é um número par");
        }
        else{
            System.out.println(numero + " é um número ímpar");
        }
    }
}
