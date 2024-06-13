import java.util.Scanner;

public class NotaTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cada elemento é a nota em uma disciplina
        double[] notasAluno = new double[5];

        for (int i = 0; i < notasAluno.length; i++){
            System.out.println("Digite a nota " + (i + 1));
            notasAluno[i] = scanner.nextDouble();
        }
        //Calculando a média das notas
        double somaNotas = 0;
        for (int i = 0; i < notasAluno.length; i++){
            somaNotas += notasAluno[i];
        }
        double media = somaNotas / notasAluno.length;

        //Imprimindo a média e determinado a situação do aluno
        System.out.println("Média do aluno: " + media);
        if(media >= 7.0) {
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
}
