import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int contadorPares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + contadorPares);

        scanner.close();
    }
}