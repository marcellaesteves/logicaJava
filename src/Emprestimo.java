import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroParcelas;
        double valorParcela, valorEmprestimo, valorTotal;

        System.out.println("Qual valor você quer emprestado?");
        valorEmprestimo = scanner.nextDouble();
        System.out.println("Você quer pagar em quantas parcelas?");
        numeroParcelas = scanner.nextInt();
        valorTotal = valorEmprestimo + ((valorEmprestimo * 20) / 100);
        valorParcela = valorTotal / numeroParcelas;
        System.out.println("Valor a ser emprestado: " + valorEmprestimo);
        System.out.println("Valor total do empréstimo: " + valorTotal);
        System.out.println("Número de parcelas: " + numeroParcelas);
        System.out.println("Valor parcela: " + valorParcela);
    }
}
