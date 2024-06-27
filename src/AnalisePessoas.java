import java.util.Scanner;

public class AnalisePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        String sexo;
        double peso;
        int mulheres = 0;
        int homensMaisCem = 0;
        double mediaMulheres;
        double maiorPeso = 0;
        double pesoMulheres = 0;

        System.out.println("Escreva o sexo da 1a pessoa (feminino/ masculino):");
        sexo = scanner.nextLine();
        System.out.println("Escreva o peso da 1a pessoa:");
        peso = scanner.nextDouble();

        if (sexo.equals("feminino")){
            mulheres++;
            pesoMulheres += peso;
        }
        if (sexo.equals("masculino")){
            if (peso > 100){
                homensMaisCem++;
            }
            maiorPeso = peso;
        }
        while (i != 8){
            System.out.println("Escreva o sexo da " + i + "a pessoa (feminino/ masculino):");
            sexo = scanner.nextLine();
            System.out.println("Escreva o peso da " + i + "a pessoa:");
            peso = scanner.nextDouble();

            if (sexo.equals("feminino")){
                mulheres++;
                pesoMulheres += peso;
            }
            if (sexo.equals("masculino")){
                if (peso > 100){
                    homensMaisCem++;
                }
                if (maiorPeso < peso){
                    maiorPeso = peso;
                }
            }
            i++;
        }
        mediaMulheres = pesoMulheres / mulheres;
        System.out.println("Foram cadastradas " + mulheres + " mulheres");
        System.out.println(homensMaisCem + " homens pesam mais de 100 kg");
        System.out.println("A média de peso das mulheres cadastradas é " + mediaMulheres + " kg");
        System.out.println("O maior peso entreos homens é " + maiorPeso + " kg");
    }
}
