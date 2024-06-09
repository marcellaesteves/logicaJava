import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempF, tempC;

        System.out.println("Escreva a temperatura em farenheit");
        tempF = scanner.nextDouble();
        tempC = (tempF - 32) / 1.8;
        System.out.println(tempF + " graus farenheit equivalem a " + tempC + " graus celcius");
    }
}
