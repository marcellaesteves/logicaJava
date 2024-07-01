import java.util.Scanner;

public class Funcao {

    public static int soma(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    public static int subtracao(int valor1, int valor2){
        int resultado;
        resultado = valor1 - valor2;
        return resultado;
    }

    public static int multiplicacao(int valor1, int valor2){
        int resultado;
        resultado = valor1 * valor2;
        return resultado;
    }

    public static float divisao(int valor1, int valor2){
        float resultado;
        resultado = (float)valor1 / valor2;
        return resultado;
    }

    public static boolean divisorValido(int divisor){
        if (divisor == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1, v2;
        System.out.println("Digite um valor para o cálculo:");
        v1 = scanner.nextInt();
        System.out.println("Digite outro valor para o cálculo:");
        v2 = scanner.nextInt();
        System.out.println("O resultado da soma é " + soma(v1, v2));
        System.out.println("O resultado da subtração é " + subtracao(v1, v2));
        System.out.println("O resultado da multiplicação é " + multiplicacao(v1, v2));
        if(divisorValido(v2)){
            System.out.println("O resultado da divisão é " + divisao(v1, v2));
        }else {
            System.out.println("Não é possível dividir por 0");
        }
    }
}
