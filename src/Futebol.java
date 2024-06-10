import java.util.Scanner;

public class Futebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int madureira, bangu, diferencaGol;
        String status;

        System.out.println("Quantos gols o madureira fez?");
        madureira = scanner.nextInt();
        System.out.println("Quantos gols o bangu fez?");
        bangu = scanner.nextInt();
        if (madureira > bangu){
            diferencaGol = madureira - bangu;
        }else {
            diferencaGol = bangu - madureira;
        }
        switch (diferencaGol){
            case 0:
                status = "Empate";
                break;
            case 1, 2, 3:
                status = "Partida normal";
                break;
            default:
                status = "Goleada";
        }
        System.out.println("Status: " + status);
    }
}
