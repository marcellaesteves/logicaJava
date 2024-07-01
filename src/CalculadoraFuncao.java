import java.util.Scanner;

public class CalculadoraFuncao {
    public static int soma(int valor1, int valor2){
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
        resultado = (float)valor1/valor2;
        return resultado;
    }

    public static boolean divisorValido(int divisor){
        if (divisor == 0){
            return false;
        }else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha, v1, v2;

        System.out.println("Escolha a opção que deseja realizar");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        escolha = scanner.nextInt();

        System.out.println("Digite o primeiro valor:");
        v1 = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        v2 = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("O resultado da soma é: " + soma(v1, v2));
                break;

            case 2:
                System.out.println("O resultado da subtração é: " + subtracao(v1, v2));
                break;

            case 3:
                System.out.println("O resultado da multiplicação é: " + multiplicacao(v1, v2));
                break;

            case 4:
                if (divisorValido(v2)){
                    System.out.println("O resultado da divisão é: " + divisao(v1, v2));
                }else {
                    System.out.println("Não é possível dividir por 0");
                }
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}
