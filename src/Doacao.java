import java.util.Scanner;

public class Doacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        int escolha;

        System.out.println("Bem vindo ao menu de doações");
        System.out.println("Muito obrigada por ajudar!");
        System.out.println("Digite [1] para doar R$10,00");
        System.out.println("Digite [2] para doar R$25,00");
        System.out.println("Digite [3] para doar R$50,00");
        System.out.println("Digite [4] para doar outros valores");
        System.out.println("Digite [5] para cancelar");
        escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                valor += 10.00;
                break;
            case 2:
                valor += 25.00;
                break;
            case 3:
                valor += 50.00;
                break;
            case 4:
                System.out.println("Qual valor deseja doar?");
                valor = scanner.nextDouble();
                break;
            case 5:
                System.out.println("Operação cancelada!");
                break;
            default:
                System.out.println("Opção Inválida");
        }
        System.out.println("Você doou " + valor + " reais");
    }
}
