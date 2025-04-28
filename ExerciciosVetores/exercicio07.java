import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o número que deseja contar no vetor: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("\nO número " + numeroParaContar + " aparece " + contador + " vezes no vetor.");

        scanner.close();
    }
}

