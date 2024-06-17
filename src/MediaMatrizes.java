public class MediaMatrizes {
    public static void main(String[] args) {
        double[][] notasEstudantes = {
                {7.5, 8.0, 9.0},
                {6.0, 7.5, 8.5},
                {8.0, 9.0, 9.5},
        };
        for (int i =0; i < notasEstudantes.length; i++){
            double somaNotas = 0;
            for (int j =0; j < notasEstudantes.length; j++){
                somaNotas += notasEstudantes[i][j];
            }
            double meddia = somaNotas / notasEstudantes[i].length;
            System.out.println("Média do estudante: " + meddia);
        }

    }
}
