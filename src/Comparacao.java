import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor (inteiro)");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor (inteiro)");
        b = scanner.nextInt();
        if (a > b){
            System.out.println(a + " é maior do que " + b);
        }else {
            System.out.println(b + " é maior do que " + a);
        }
    }
}
