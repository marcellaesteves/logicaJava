import java.util.Scanner;

public class IdadeMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoNasc, anoAtual, idade;

        System.out.println("Qual seu ano de nascimento?");
        anoNasc = scanner.nextInt();
        System.out.println("Em qual ano estamos?");
        anoAtual = scanner.nextInt();
        idade = anoAtual - anoNasc;
        if (idade < 18){
            System.out.println("Em " + anoAtual + " você terá " + idade + " anos e ainda não será maior de idade");
        }
        else{
            System.out.println("Em " + anoAtual + " você terá " + idade + " anos e já será maior de idade");
        }
    }
}
