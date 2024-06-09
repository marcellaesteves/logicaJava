import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lado1, lado2, lado3;
        boolean podeTri, escaleno, isosceles, equilatero;

        System.out.println("Digite o primeiro lado");
        lado1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado");
        lado2 = scanner.nextDouble();
        System.out.println("Digite o terceiro lado");
        lado3 = scanner.nextDouble();
        podeTri = (lado1 < lado2 + lado3) && (lado2 < lado1 + lado2) && (lado3 < lado1 + lado2);
        equilatero = (lado1 == lado2) && (lado2 == lado3);
        escaleno = (lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1);
        isosceles = (!equilatero) && (!escaleno);
        System.out.println("Pode formar um triângulo: " + podeTri);
        System.out.println("Triângulo equilátero: " + equilatero);
        System.out.println("Triângulo escaleno: " + escaleno);
        System.out.println("Triângulo isósceles: " + isosceles);

    }
}
