import java.util.Scanner;
public class exercicio06 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o número que deseja remover: ");
        int numeroParaRemover = scanner.nextInt();
        
        int posicaoRemover = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroParaRemover) {
                posicaoRemover = i;
                break; 
            }
        }

        if (posicaoRemover == -1) {
            System.out.println("\nNúmero não encontrado no vetor.");
        } else {

            int[] novoVetor = new int[vetor.length - 1];
            int j = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (i != posicaoRemover) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            }

            System.out.println("\nVetor após remover o número:");
            for (int i = 0; i < novoVetor.length; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        }

        scanner.close();
    }
}
