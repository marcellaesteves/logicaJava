import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, multiplica;
        int i = 0;

        System.out.println("Digite o número que deseja saber a multiplicação");
        numero = scanner.nextInt();

        while (i != 11){
            multiplica = i * numero;
            System.out.println(numero + " x " + i + " = " + multiplica);
            i++;
        }
    }
}
