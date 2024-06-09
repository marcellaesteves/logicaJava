import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Qual sua altura (em metros)?");
        altura = scanner.nextDouble();
        System.out.println("Qual seu peso (em kg)?");
        peso = scanner.nextDouble();
        imc = peso / (altura * altura);
        System.out.print("Seu IMC é: " + imc);
        if((imc >= 18.5) && (imc <= 25)){
            System.out.print(" e você está no peso ideal para sua altura.");
        }
        else{
            System.out.print(" e você não está no peso ideal para sua altura.");
        }

    }
}
