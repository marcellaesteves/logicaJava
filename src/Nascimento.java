import java.util.Scanner;

public class Nascimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual, anoNasc, idade;

        System.out.println("Em qual ano você nasceu");
        anoNasc = scanner.nextInt();
        System.out.println("Em qual ano estamos?");
        anoAtual = scanner.nextInt();
        idade = anoAtual - anoNasc;
        System.out.println("Você tem ou fará " + idade + " anos em " + anoAtual);
    }
}
