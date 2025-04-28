import java.util.ArrayList;
import java.util.Scanner;

public class exercicio09 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[6];
        int[] vetorB = new int[6];
        ArrayList<Integer> vetorC = new ArrayList<>(); 

        System.out.println("Digite 6 números para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 6 números para o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j] && !vetorC.contains(vetorA[i])) {
                    vetorC.add(vetorA[i]);
                }
            }
        }

        System.out.println("\nElementos comuns (interseção):");
        if (vetorC.isEmpty()) {
            System.out.println("Não há elementos comuns entre A e B.");
        } else {
            for (int num : vetorC) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}

