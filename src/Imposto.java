import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorItens, valorImposto;

        System.out.println("Digite o valor total (em dólares) dos produtos comprados");
        valorItens = scanner.nextDouble();
        valorImposto = (valorItens * 60) / 100;
        System.out.println("O valor do imposto sobre os itens será de " + valorImposto + " dólares");
    }
}
