import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroInserido = scanner.nextInt();

        String resultado = pertenceFibonacci(numeroInserido);
        System.out.println(resultado);
    }

    static String pertenceFibonacci(int numero) {
        int a = 0, b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (b == numero) {
            return numero + " pertence à sequência de Fibonacci.";
        } else {
            return numero + " não pertence à sequência de Fibonacci.";
        }
    }
}
