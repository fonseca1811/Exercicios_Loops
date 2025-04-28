import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10]; 

        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        // Ler vetor B
        System.out.println("\nDigite 5 números para o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];    
            vetorC[i + vetorA.length] = vetorB[i]; 
        }

        System.out.println("\nVetor C (união de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        scanner.close();
    }
}
