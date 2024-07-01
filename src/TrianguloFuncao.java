import java.util.Scanner;

public class TrianguloFuncao {
    public static boolean formaTriangulo(double l1, double l2, double l3){
        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
            return true;
        }else
            return false;
    }
    public static boolean equilatero(double l1, double l2, double l3){
        if (l1 == l2 && l2 == l3){
            return true;
        } else {
            return false;
        }
    }
    public static boolean escaleno(double l1, double l2, double l3){
        if (l1 != l2 && l1 != l3 && l3 != l2){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1, l2, l3;
        System.out.println("Digite o primeiro lado:");
        l1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado:");
        l2 = scanner.nextDouble();
        System.out.println("Digite o terceiro lado:");
        l3 = scanner.nextDouble();
        if (formaTriangulo(l1, l2, l3)){
            System.out.print("Forma um triângulo");
            if (equilatero(l1, l2, l3)){
                System.out.println(" equilátero");
            }
            if (escaleno(l1, l2, l3)){
                System.out.println(" escaleno");
            }
            if (!escaleno(l1, l2, l3) && !equilatero(l1, l2, l3)){
                System.out.println(" isósceles");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
