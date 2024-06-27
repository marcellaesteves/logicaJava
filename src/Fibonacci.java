public class Fibonacci {
    public static void main(String[] args) {
        int i = 0;
        int numero1 = 1;
        int numero2 = 1;
        int numero3;

        System.out.print(numero1 + " ");
        System.out.print(numero2 + " ");

        while(i != 8){
            i++;
            numero3 = numero1 + numero2;
            System.out.print(numero3 + " ");
            numero1 = numero2;
            numero2 = numero3;
        }
    }
}
