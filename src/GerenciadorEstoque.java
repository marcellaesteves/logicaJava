import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Vetor com nome de produtos no estoque
        String[] produtosEstoque = new String[5];

        for (int i = 0; i < produtosEstoque.length; i++){
            System.out.println("Digite o nome do produto " + (i + 1));
            produtosEstoque[i] = scanner.next() + scanner.nextLine();
        }

        //Produtos que queremos ver se tem
        System.out.println("Digite o produto procurado");
        String produtoProcurado = scanner.next() + scanner.nextLine();

        //Ficar esteticamente bom
        System.out.println("-------------------------");
        System.out.println("Produtos em estoque:");

        //Exibe tudo em estoque
        for (int i = 0; i < produtosEstoque.length; i++) {
            System.out.println(produtosEstoque[i]);
        }

        //Ficar esteticamente bom
        System.out.println("-------------------------");

        //Verificando disponibilidade do produto
        boolean produtoEncontrado = false;
        int i = 0;
        while (!produtoEncontrado && i < produtosEstoque.length){
            if (produtosEstoque[i].equals(produtoProcurado)) {
                produtoEncontrado = true;
            }
            i++;
        }

        //Imprimindo resultaddo da busca
        if (produtoEncontrado){
            System.out.println(produtoProcurado + " está disponível no estoque");
        } else {
            System.out.println(produtoProcurado + " não foi encontrado no estoque");
        }
    }
}
