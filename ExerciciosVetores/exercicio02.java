import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maiorValor = vetor[0];
        int indiceMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                indiceMaior = i;
            }
        }

        System.out.println("\nO maior valor do vetor é: " + maiorValor);
        System.out.println("Ele está na posição (índice): " + indiceMaior);

        scanner.close();
    }
}