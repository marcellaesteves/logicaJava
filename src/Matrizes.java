public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2]; //Matriz com 3 linhas e 2 colunas
        int[][] matrizDireta = {{1, 2}, {3, 4}, {5, 6}};
        int elemento = matrizDireta[0][1]; //Acessa o elemento da primeira linha e segunda coluna

        matrizDireta[0][1] = 10; //Modifica o elemento da primeira linha e segunda coluna para 10

        for (int i = 0; i < matrizDireta.length; i++) { //Percorre linhas
            for (int j = 0; j < matrizDireta[i].length; j++) { //Percorre colunas
                System.out.println(matrizDireta[i][j]);
            }
        }
    }
}
