import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salario, novoSalario;
        int dependentes;

        System.out.println("Qual seu nome?");
        nome = scanner.next();
        System.out.println("Qual seu salário atual?");
        salario = scanner.nextDouble();
        System.out.println("Quantos dependentes possui?");
        dependentes = scanner.nextInt();

        switch (dependentes){
            case 0:
                novoSalario = salario + (salario * 5 / 100);
                break;
            case 1, 2, 3:
                novoSalario =  salario + (salario * 10 / 100);
                break;
            case 4, 5, 6:
                novoSalario = salario + (salario * 15 / 100);
                break;
            default:
                novoSalario = salario + (salario * 20 / 100);
        }
        System.out.println("Olá " + nome + "! seu novo salário será " + novoSalario + " reais");
    }
}
