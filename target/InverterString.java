import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String stringOriginal = scanner.nextLine();

        String stringInvertida = inverterString(stringOriginal);
        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);
    }

    static String inverterString(String s) {
        StringBuilder stringInvertida = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringInvertida.append(s.charAt(i));
        }

        return stringInvertida.toString();
    }
}
