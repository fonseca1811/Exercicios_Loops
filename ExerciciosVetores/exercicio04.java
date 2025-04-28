import java.util.Scanner;
public class exercicio04 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nVetor na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        scanner.close();
    }
}

