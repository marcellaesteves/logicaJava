import java.util.Scanner;

public class ContagemWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int i = 0;

        System.out.println("Digite o número que deseja finalizar a contagem:");
        numero = scanner.nextInt();

        while (i != (numero + 1)){
            System.out.print(i + ", ");
            i++;
        }
        System.out.println(" FIM!");
    }
}
