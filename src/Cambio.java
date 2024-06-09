import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cambio, dolar, real;

        System.out.println("Qual o valor do cambio de hoje (real para dólar)?");
        cambio = scanner.nextDouble();
        System.out.println("Quanto você tem em real?");
        real = scanner.nextDouble();
        dolar = real / cambio;
        System.out.println("Convertendo " + real + " reais no cambio de hoje, você terá " + dolar + " dólares");
    }
}
