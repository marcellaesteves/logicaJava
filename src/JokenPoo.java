import java.util.Scanner;

public class JokenPoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jogada1, jogada2;

        System.out.println("Escolha pedra, papel ou tesoura:");
        jogada1 = scanner.nextLine();
        System.out.println("Escolha pedra, papel ou tesoura:");
        jogada2 = scanner.nextLine();

     if (jogada1.equals("pedra") && jogada2.equals("papel")){
         System.out.println("Jogador 2 ganhou!");
     } else if (jogada1.equals("pedra") && jogada2.equals("tesoura")) {
         System.out.println("Jogador 1 ganhou!");
     } else if (jogada1.equals("papel") && jogada2.equals("pedra")) {
         System.out.println("Jogador 1 ganhou!");
     } else if (jogada1.equals("papel") && jogada2.equals("tesoura")) {
         System.out.println("Jogador 2 ganhou!");
     } else if (jogada1.equals("tesoura") && jogada2.equals("pedra")) {
         System.out.println("Jogador 2 ganhou!");
     } else if (jogada1.equals("tesoura") && jogada2.equals("papel")) {
         System.out.println("Jogador 1 ganhou!");
     } else if (jogada1.equals(jogada2)) {
         System.out.println("Empate!");
     }else {
         System.out.println("Opção inválida!");
     }
    }
}
