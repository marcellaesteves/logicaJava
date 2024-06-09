import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorViagem;
        System.out.println("Qual valor você tem disponível para a viagem?");
        valorViagem = scanner.nextDouble();
        if (valorViagem >= 10000){
            System.out.println("Partiu Disney!");
        }
        else{
            System.out.println("Viagem cancelada...");
        }
    }
}
