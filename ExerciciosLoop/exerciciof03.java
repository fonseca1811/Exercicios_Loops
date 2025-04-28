public class exerciciof03 {
    public static void main(String[] args) {
        int[] vetor = {9, 6, 75, 3, 5, 9, 4, 32, 10, 10};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}

