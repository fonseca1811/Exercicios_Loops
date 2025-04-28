import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[12];
        double soma = 0;

        System.out.println("Digite 12 números:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / 12;
        System.out.println("\nMédia dos números: " + media);

        int acimaDaMedia = 0;
        for (double num : numeros) {
            if (num > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Quantidade de números acima da média: " + acimaDaMedia);

        scanner.close();
    }
}