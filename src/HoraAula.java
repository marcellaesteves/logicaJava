import java.util.Scanner;

public class HoraAula {
    public static double nivel1(){
        double valor = 21.50;
        return valor;
    }
    public static double totalNivel1(int horas){
        double valor = 21.50;
        double resultado;
        resultado = horas * valor;
        return resultado;
    }
    public static double nivel2(){
        double valor = 24.20;
        return valor;
    }
    public static double totalNivel2(int horas){
        double valor = 24.20;
        double resultado;
        resultado = horas * valor;
        return resultado;
    }
    public static double nivel3(){
        double valor = 30.00;
        return valor;
    }
    public static double totalNive3(int horas){
        double valor = 30.00;
        double resultado;
        resultado = horas * valor;
        return resultado;
    }

    public static void nivel(){
        System.out.println("Digite seu nível: ");
        System.out.println("1 - Nível 1");
        System.out.println("2 - Nível 2");
        System.out.println("3 - Nível 3");
    }
    public static void horas(){
        System.out.println("Quantas aulas você deu essa semana?");
    }
    public static void chamafuncao(int escolha, int horas){
        switch (escolha){
            case 1:
                System.out.println("Você receberá R$" + nivel1() + " por aula e o valor total da semana será R$" + totalNivel1(horas));
                break;
            case 2:
                System.out.println("Você receberá R$" + nivel2() + " por aula e o valor total da semana será R$" + totalNivel2(horas));
                break;
            case 3:
                System.out.println("Você receberá R$" + nivel3() + " por aula e o valor total da semana será R$" + totalNive3(horas));
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nivel, horas;

        nivel();
        nivel = scanner.nextInt();
        horas();
        horas = scanner.nextInt();
        chamafuncao(nivel, horas);
    }
}
